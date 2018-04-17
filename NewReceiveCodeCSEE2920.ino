#include <SPI.h>
#include <nRF24L01.h>
#include <RF24.h>

#define led 4
#define button 2

RF24 radio(7,8);
const byte addresses[][6] = {"HMZ01" , "HMZ02"};
boolean buttonState = 0;
boolean buttonState1 = 0;

void setup() {
  pinMode(led, OUTPUT);
  pinMode(button, INPUT);
  radio.begin();
  radio.openWritingPipe(addresses[0]); //HMZ02
  radio.openReadingPipe(1, addresses[1]); //HMZ01
  radio.setPALevel(RF24_PA_HIGH);
}

void loop() {
  delay(5);
  
  radio.startListening();
  while (!radio.available());
  radio.read(&buttonState, sizeof(buttonState));
  if(buttonState == HIGH){
    digitalWrite(led, HIGH);
  }else{
    digitalWrite(led, LOW);
  }
  
  delay(5);

  radio.stopListening();
  buttonState1 = digitalRead(button);
  radio.write(&buttonState1, sizeof(buttonState1));

}//loop 

#include <SPI.h>
#include <nRF24L01.h>
#include <RF24.h>

//#define led 4
#define button 2

RF24 radio(7,8);
const byte addresses[][6] = {"HMZ01"};
boolean buttonState = 0;
boolean buttonState1 = 0;

void setup() {
 // pinMode(led, OUTPUT);
  pinMode(button, INPUT);
  radio.begin();
  radio.openWritingPipe(addresses[1]); //HMZ01
 // radio.openReadingPipe(1, addresses[0]); //HMZ02
  radio.setPALevel(RF24_PA_HIGH);
}

void loop() {
  delay(5);

  radio.stopListening();
  buttonState = digitalRead(button);
  radio.write(&buttonState, sizeof(buttonState));

 // delay(5);
 // radio.startListening();
 // while (!radio.available());
 // radio.read(&buttonState1, sizeof(buttonState1));
 // if(buttonState1 == HIGH){
 //   digitalWrite(led, HIGH);
 // }else{
 //   digitalWrite(led, LOW);
 // }

}//loop 

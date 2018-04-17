import java.util.Scanner;
import com.fazecast.jSerialComm.*;

public class Test {

	public static void main(String[] args) {


		
		

		SerialPort[] ports = SerialPort.getCommPorts();
		System.out.println("Select a port:");
		int i = 1;
		for(SerialPort port : ports){
			System.out.println(i++ +  ": " + port.getSystemPortName());
			
		}
		Scanner s = new Scanner(System.in);
		int chosenPort = s.nextInt();

		SerialPort serialPort = ports[chosenPort - 1];
		if(serialPort.openPort())
			System.out.println("Port opened successfully.");
		else {
			System.out.println("Unable to open the port.");
			return;
		}
		//serialPort.setComPortParameters(9600, 8, 1, SerialPort.NO_PARITY);
		serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING, 0, 0);
		
		List<Block> BlockChain = new ArrayList<Block>();
		BlockChain.add(new Block(0,"Block 0");
		ListIterator<Block> listIterator = BlockChain.listIterator();	       
		Scanner data = new Scanner(serialPort.getInputStream());
		String request = 0;
		while(data.hasNextLine()){
			try{request = data.nextLine();}catch(Exception e){}	
			BlockChain.add(new Block(listIterator.previous().hashCode, request);
			listIterator.next();		       
		}
		System.out.println("Done.");
	}

}

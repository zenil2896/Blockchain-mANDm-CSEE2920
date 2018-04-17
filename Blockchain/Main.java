import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	ArrayList<Block> blockchain = new ArrayList<>();

	public static void main(String[] args) {
		String message1 = "Hello how are you!";
		String message2 = "Hi!";
		Block Block0 = new Block(0, message1);
		Block Block1 = new Block(Block0.getBlockHash(), message2);

		String message3 = "The Toster needs energy";
		String message4 = "The Tv has been on for too long ";
		Block Block2 = new Block(Block1.getBlockHash(), message3);
		Block Block3 = new Block(Block2.getBlockHash(), message4);
		
		System.out.println("Block 0 Hash: " + Block0.getBlockHash());
		System.out.println("Block 0 Previous Hash: " + Block0.getPreviousHash());
		System.out.println("Block 0 Data: " + Block0.getTransactions());
		System.out.println("Block 0 Timestamp: " + Block0.getTimeStamp());
		System.out.println();
		System.out.println("Block 1: " + Block1.getBlockHash());
		System.out.println("Block 1 Previous Hash: " + Block1.getPreviousHash());
		System.out.println("Block 1 Data: " + Block1.getTransactions());
		System.out.println("Block 1 Timestamp: " + Block1.getTimeStamp());
		System.out.println();
		System.out.println("Block 2: " + Block2.getBlockHash());
		System.out.println("Block 2 Previous Hash: " + Block2.getPreviousHash());
		System.out.println("Block 2 Data: " + Block2.getTransactions());
		System.out.println("Block 2 Timestamp: " + Block2.getTimeStamp());
		System.out.println();
		System.out.println("Block 3: " + Block3.getBlockHash());
		System.out.println("Block 3 Previous Hash: " + Block3.getPreviousHash());
		System.out.println("Block 3 Data: " + Block3.getTransactions());
		System.out.println("Block 3 Timestamp: " + Block3.getTimeStamp());
		System.out.println();
	}

}

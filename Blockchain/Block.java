import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Block {
	
	private int previousHash;
	private String transactions;
	private String timeStamp;
	
	private int blockHash;
	
	public Block(int previousHash, String transcations) {
		this.previousHash = previousHash;
		this.transactions = transcations;
		//this.timeStamp = (new Date().getTime())/(24*60*60*1000);
		this.timeStamp = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		Object[] contents = {transcations, previousHash, timeStamp};
		this.blockHash = Arrays.hashCode(contents);
		
	}
	
	public int getPreviousHash() {
		return previousHash;
	}

	public String getTransactions(){
		return transactions;
	}
	
	public int getBlockHash() {
		return blockHash;
	}
	
	public String getTimeStamp(){
		return timeStamp;
	}
	
		
	}

package ICCharger;
import java.util.Calendar;

public class ChargeHistory {
	private int id = 0;
	private Calendar date;
	private int balance = 0;
	
	ChargeHistory(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	
	int getId() {
		return id;
	}
	
	Calendar getDate() {
		return date;
	}
	
	int getBalance() {
		return balance;
	}
}

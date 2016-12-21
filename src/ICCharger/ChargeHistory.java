package ICCharger;
import java.util.Calendar;

public class ChargeHistory {
	int id = 0;
	Calendar date;
	int balance = 0;
	
	ChargeHistory(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}
}

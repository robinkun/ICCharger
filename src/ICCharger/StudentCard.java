package ICCharger;

public class StudentCard {
	private String studentName; // äwê∂ñº
	private String studentNumber; // äwê–î‘çÜ
	private int accountBalance; // écçÇ
	
	void setStudentName(String name) {
		studentName = name;
	}
	
	String getStudentName() {
		return studentName;
	}
	
	void setStudentNumber(String number) {
		studentNumber = number;
	}
	
	String getStudentNumber() {
		return studentNumber;
	}
	
	void setAccountBalance(int money) {
		accountBalance = money;
	}
	
	int getAccountBalance() {
		return accountBalance;
	}
}

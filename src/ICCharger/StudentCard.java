package ICCharger;

public class StudentCard {
	private String studentName; // 学生名
	private String studentNumber; // 学籍番号
	private int accountBalance; // 残高
	
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

package ICCharger;

public class StudentCard {
	private String studentName; // 学生名
	private int studentNumber; // 学籍番号
	private int accountBalance; // 残高
	
	void setStudentName(String name) {
		studentName = name;
	}
	
	String getStudentName() {
		return studentName;
	}
	
	void setStudentNumber(int number) {
		studentNumber = number;
	}
	
	int getStudentNumber() {
		return studentNumber;
	}
	
	void setAccountBalance(int money) {
		accountBalance = money;
	}
	
	int getAccountBalance() {
		return accountBalance;
	}
}

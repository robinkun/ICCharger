package ICCharger;

public class StudentCard {
	private String studentName; // �w����
	private int studentNumber; // �w�Дԍ�
	private int accountBalance; // �c��
	
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

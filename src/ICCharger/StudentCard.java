package ICCharger;

public class StudentCard {
	private String studentName; // �w����
	private String studentNumber; // �w�Дԍ�
	private int accountBalance; // �c��
	
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

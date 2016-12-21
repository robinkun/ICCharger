package ICCharger;
import java.util.ArrayList;

public class StudentCard {
	private String studentName = ""; // �w����
	private int studentNumber = 0; // �w�Дԍ�
	private int accountBalance = 0; // �c��
	private final int maxBalance = 10000;
	static ArrayList<StudentCard> cardList = new ArrayList<StudentCard>();
	
	StudentCard(int num, String name) {
		setStudentName(name);
		setStudentNumber(num);
		cardList.add(this);
	}
	
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
	
	ArrayList<StudentCard> getStudentCardList() {
		return cardList;
	}
	
	// 10000�~�������獷�z��Ԃ��B
	int chargeAccountBalance(int money) {
		accountBalance += money;
		if(accountBalance > maxBalance) {
			int sub = accountBalance - maxBalance; // ���z
			accountBalance = maxBalance;
			return sub;
		}
		return 0;
	}
	
}

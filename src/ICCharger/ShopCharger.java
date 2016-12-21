package ICCharger;

public class ShopCharger {
	private StudentCard insertedCard;
	
	void insertStudentCard(StudentCard card) { 
		insertedCard = card;
	}
	
	int chargeMoney(int money) {
		if(insertedCard == null) return 0;
		return insertedCard.chargeAccountBalance(money);
	}
	
	void printAccountBalance() {
		System.out.printf("�w�Дԍ��F%6d, ���O�F%s, �c��%d�~\n",
				insertedCard.getStudentNumber(), insertedCard.getStudentName(), insertedCard.getAccountBalance());
	}
}

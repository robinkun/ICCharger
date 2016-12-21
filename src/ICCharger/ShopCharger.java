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
		System.out.printf("学籍番号：%6d, 名前：%s, 残高%d円\n",
				insertedCard.getStudentNumber(), insertedCard.getStudentName(), insertedCard.getAccountBalance());
	}
}

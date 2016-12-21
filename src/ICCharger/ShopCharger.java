package ICCharger;

import java.util.*;

public class ShopCharger {
	private StudentCard insertedCard;
	private Queue<ChargeHistory> finalChargeDate = new ArrayDeque<ChargeHistory>();
	
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

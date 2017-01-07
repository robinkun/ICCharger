package ICCharger;

import java.util.*;

public class ShopCharger {
	private StudentCard insertedCard;
	private Queue<ChargeHistory> finalChargeDate = new ArrayDeque<ChargeHistory>();
	static private final int maxHistory = 5;
	
	void insertStudentCard(StudentCard card) { 
		insertedCard = card;
	}
	
	int chargeMoney(int money) {
		if(insertedCard == null) {
			System.out.printf("�J�[�h���}������Ă��܂���\n");
			return 0;
		}
		if(finalChargeDate.size() >= maxHistory) {
			finalChargeDate.poll();
		}
		
		int difference = insertedCard.chargeAccountBalance(money);
		ChargeHistory history = new ChargeHistory(insertedCard.getStudentNumber(), insertedCard.getAccountBalance());
		finalChargeDate.offer(history);
		return difference;
	}
	
	void printAccountBalance() {
		System.out.printf("�w�Дԍ��F%6d, �����F%s, �c��%d�~\n",
				insertedCard.getStudentNumber(), insertedCard.getStudentName(), insertedCard.getAccountBalance());
	}
	
	void printChargeHistory() {
		Iterator<ChargeHistory> i = finalChargeDate.iterator();
		
		while(i.hasNext()) {
			ChargeHistory ch = (ChargeHistory)i.next();
			System.out.printf("id:%d, Date:%s, balance:%d\n", ch.getId(), ch.getDate().getTime(), ch.getBalance());
		}
	}
}

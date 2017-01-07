package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		StudentCard card1, card2;
		card1 = new StudentCard(163000, "Mila Mola");
		card2 = new StudentCard(129888, "Pika Chu");
		ShopCharger mainShopCharger = new ShopCharger();
		
		mainShopCharger.insertStudentCard(card1);
		mainShopCharger.chargeMoney(3000);
		mainShopCharger.chargeMoney(300);
		mainShopCharger.chargeMoney(200);
		mainShopCharger.chargeMoney(100);
		mainShopCharger.chargeMoney(800);
		mainShopCharger.printAccountBalance();
		
		mainShopCharger.insertStudentCard(card2);
		mainShopCharger.chargeMoney(8765);
		mainShopCharger.printAccountBalance();
		
		System.out.println("発行学生証枚数:" + card1.getStudentCardList().size());
		System.out.println("発行学生証枚数:" + card2.getStudentCardList().size());
		
		mainShopCharger.printChargeHistory();
	}
}

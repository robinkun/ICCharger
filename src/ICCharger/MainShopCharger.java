package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		StudentCard card1, card2;
		card1 = new StudentCard(163000, "���������̖� �a�`");
		card2 = new StudentCard(129888, "�^��� �\������");
		ShopCharger mainShopCharger = new ShopCharger();
		
		mainShopCharger.insertStudentCard(card1);
		mainShopCharger.chargeMoney(3000);
		mainShopCharger.printAccountBalance();
		
		mainShopCharger.insertStudentCard(card2);
		mainShopCharger.chargeMoney(8765);
		mainShopCharger.printAccountBalance();
	}
}

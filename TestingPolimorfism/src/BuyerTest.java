
public class BuyerTest {

	public static void main(String[] args) {
		Car c = new Car("Corsa", 50_000.0);

		double dic = new DiscountInCash().giveDiscount(c);

		System.out.println(dic);

		double db = new DiscountBiggerThanHalf().giveDiscount(c);

		System.out.println(db);
	}
}

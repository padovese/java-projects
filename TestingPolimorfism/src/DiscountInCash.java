
public class DiscountInCash implements Discount {

	@Override
	public double giveDiscount(Car car) {
		if (car.getPrice() == 50_000.0) {
			return car.getPrice() * 0.05;
		}
		return 0;
	}

}

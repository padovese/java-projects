
public class DiscountBiggerThanHalf implements Discount {

	@Override
	public double giveDiscount(Car car) {
		if (car.getPrice() == 30_000.0) {
			return car.getPrice() * 0.3;
		}
		return 0;
	}

}

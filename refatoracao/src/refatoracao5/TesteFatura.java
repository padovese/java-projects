package refatoracao5;

public class TesteFatura {

	public static void main(String[] args) {

		Fatura fatura = new Fatura(1000.0, "padovese");
		double faturaEmReal = fatura.emReal();
		double faturaEmDolar = fatura.emDolar();

		System.out.println(faturaEmReal);
		System.out.println(faturaEmDolar);
	}
}

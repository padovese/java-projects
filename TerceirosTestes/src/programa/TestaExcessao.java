package programa;
public class TestaExcessao {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		m1();
		System.out.println("Fim do main");
	}

	private static void m1() {
		System.out.println("Iniciando o metodo m1.");
			m2();
		System.out.println("Finalizando o metodo m1.");
	}

	private static void m2() {
		System.out.println("Iniciando o metodo m2.");
		
		int[] nums = new int[5];
		for(int i = 0; i < 6; i++){
				nums[i] = i * 2;
				System.out.println(nums[i]);
		}
		System.out.println("Finalizando o metodo m2.");
		
	}
}

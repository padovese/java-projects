package Questions;

public class Q47 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String h1 = "HelloWorld";
		sb.append("Hello").append("world");
		if(h1 == sb.toString()){
			System.out.println("They Match");
		}
		if(h1.equals(sb.toString())){
			System.out.println("They Really Match.");
		}
	}
}

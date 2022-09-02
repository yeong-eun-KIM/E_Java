package kr.ac.ezenac.operator02;

public class PrintfTest {

	public static void main(String[] args) {
		String name = "Admiral Yi";
		int age = 20;
		double height = 185.5;

		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height);
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height);
		
	}

}

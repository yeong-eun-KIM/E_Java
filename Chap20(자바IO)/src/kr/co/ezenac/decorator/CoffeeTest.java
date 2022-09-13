package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		
		System.out.println();
		
		Mocha kenyaMocha = new Mocha(new Latte(kenyaAmericano));
		kenyaMocha.brewing();
		
		System.out.println();
		
		WhippedCream etiopiaCream = new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		etiopiaCream.brewing();
		
		System.out.println();
		
		
	}
}

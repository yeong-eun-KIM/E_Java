package kr.co.ezenac.learngeneric;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		Powder powder = new Powder();
		printer1.setMaterial(powder);
		
		
		Powder powder2 = printer1.getMaterial();
		System.out.println(powder2);
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		
		Plastic plastic2 = printer2.getMaterial();
		System.out.println(plastic2);
	}

}

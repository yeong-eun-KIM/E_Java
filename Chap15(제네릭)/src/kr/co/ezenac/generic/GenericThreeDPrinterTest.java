package kr.co.ezenac.generic;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plsticPrinter = new GenericThreeDPrinter<>();
		Plastic plastic = new Plastic();
		plsticPrinter.setMaterial(plastic);
		System.out.println(plsticPrinter);
		
		powderPrinter.print();
		plsticPrinter.print();
	}

}

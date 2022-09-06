package kr.co.ezenac.learngeneric;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);		
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powderPrinter);
		Powder powder3 = (Powder) printer3.getMaterial();
		
	}

}

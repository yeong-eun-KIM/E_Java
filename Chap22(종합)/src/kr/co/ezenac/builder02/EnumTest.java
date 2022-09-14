package kr.co.ezenac.builder02;

enum Human {MAN,WOMAN}
enum Machine {TANK, AIRPLANE}

public class EnumTest {
	
	public static void main(String[] args) {
		createUnit(Machine.TANK);
	}

	private static void createUnit(Machine machine) {
		switch(machine) {
		case TANK :
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE :
			System.out.println("비행기를 만듭니다.");
			break;
			
		}
	}
	
	
}

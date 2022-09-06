package kr.co.ezenac.innerclass;

class OutClass{
	private int num = 10;
	private static int SNum = 20;
	private InClass inClass;
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
//		static int sInNum = 200; //static은 내부클래스에서 사용 할 수 없음
		void inTest() {
			System.out.println("OutClass num = "+ num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass SNUM = "+ SNum + "(외부 클래스의 클래스 변수)");
			System.out.println("InClass inNum = "+inNum + "(내부 클래스의 인스턴스 변수)");
		}
//		static void sTest() {
//			
//		}
	}
	
	public void usingInClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int inNum = 100;
		static int sInNum = 200;
		
		//정적 클래스의 일반 메서드
		void inTest() {
//			num+=10; 				//외부 클래스의 인스턴스 변수는 사용불가
		System.out.println("InStaticCLass inNum = "+ inNum + "(정적 내부 클래스의 인스턴스 변수 사용)");
		System.out.println("sInNum = "+sInNum+"(정적 내부 클래스의 스테틱 변수 사용)");
		System.out.println("OutClass SNum = " + SNum + "(외부 클래스의 스테틱 변수 사용)");
		}
		
		//정적 클래스의 스테틱 메서드
		static void sTest() {
		System.out.println(sInNum + "(외부 클래스의 스테틱 메서드)");
		System.out.println("InStaticClass sInNum = " + sInNum);
		}
		
	}
	
}

public class InnerClassTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
//		외부 클래스를 이용하여 내부 클래스 메서드 호출
		outClass.usingInClass();
		
		System.out.println();
		
//		외부클래스를 이용하여 내부 클래스 생성
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		System.out.println();
		
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		
		//정적 내부 클래스의 스테틱 메서드 호출
		OutClass.InStaticClass.sTest();
		
	}
	
}

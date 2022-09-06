package kr.co.ezenac.innerclass;

class Outer2 {
	
	Runnable getRunnable(int i) {
		int num = 100;
	
	return new Runnable() {
		int localNum = 10;
		
		@Override
		public void run() {
			//i=200; 매개변수와 지역변수는 상수로 바뀌어 상수풀에 저장됨
			System.out.println("i = "+i);
			System.out.println("num = "+num);
			System.out.println("localNum =" + localNum);
			System.out.println("Outer.sNum = "+ Outer.sNum);
			
		}
		
		
			};
	}
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerClass {
	public void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		}
	}


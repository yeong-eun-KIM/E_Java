package kr.co.ezenac.innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				//i=200; 매개변수와 지역변수는 상수로 바뀌어 상수풀에 저장됨
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum =" + localNum);
				
				System.out.println("outNum = " + outNum);
				System.out.println("Outer.sNum = "+ Outer.sNum);
				
			}
			
		}
		return new MyRunnable();
	}
	
}


public class LocalInnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable  = outer.getRunnable(2);
		runnable.run();
	}
}

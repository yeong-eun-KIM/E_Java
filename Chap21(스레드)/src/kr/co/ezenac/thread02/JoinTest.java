package kr.co.ezenac.thread02;

public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	 
	@Override
	public void run() {
		int i;
		for(i=0; i<101; i++)
			total += i;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");
		
		JoinTest joinTest1 = new JoinTest(1, 50);
		JoinTest joinTest2 = new JoinTest(51, 100);
		
		joinTest1.start();
		joinTest2.start();
		
		try {
			joinTest1.join();			//main 스레드 not running 상태로 됨
			joinTest2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int sum = joinTest1.total + joinTest2.total;

		System.out.println(sum);
		
		System.out.println(Thread.currentThread() +  "end");
		
	}
}

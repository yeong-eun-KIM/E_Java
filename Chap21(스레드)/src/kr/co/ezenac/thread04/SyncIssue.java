package kr.co.ezenac.thread04;

public class SyncIssue {
	public static int money = 0;
	
	public synchronized static void deposit() {money++;}
	
	public synchronized static void withdraw() {money--;}
	
	public static void main(String[] args) throws InterruptedException {
		
			Runnable task1 = () -> {
				
				for(int i=0;i<10000;i++) {
					deposit();
				}
				
			};
			
			Runnable task2 = () -> {
				
				for(int i=0;i<10000;i++) {
					withdraw();
				}
			};
			
			Thread thread1 = new Thread(task1);		
			Thread thread2 = new Thread(task2);
			
			thread1.start();	
			thread2.start();
			
			thread1.join();				//thread1의 종료를 main thread가 기다림
			thread2.join();				//thread2의 종료를 main thread가 기다림
			
			
			System.out.println(money);
		
		
	}
	
}

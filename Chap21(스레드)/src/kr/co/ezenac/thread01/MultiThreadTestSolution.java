package kr.co.ezenac.thread01;


/*
 * 여러 개의 스레드 동시 실행
 * 	- 20 미만 짝수만 출력
 * 	- 10 미만 수 출력
 */
public class MultiThreadTestSolution {
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			
			for(int even=0; even<20; even=even+2) {
				System.out.print(even + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

		};
		
		
		Runnable task2 = () -> {
			
			for(int under10=9; under10>0; under10--) {
				System.out.println("(" + under10+ ")");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();

		
	}
}

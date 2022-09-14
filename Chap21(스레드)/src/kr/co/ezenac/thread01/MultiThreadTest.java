package kr.co.ezenac.thread01;


/*
 * 여러 개의 스레드 동시 실행
 * 	- 20 미만 짝수만 출력
 * 	- 10 미만 수 출력
 */
public class MultiThreadTest {
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			int even;
			for(even=0; even<20; even++) {
				if(even%2 == 0) {
					//System.out.println(even + " ,");
					String name1 = Thread.currentThread().getName();
					System.out.print(name1 + " : " + even+" ");
					System.out.println();
				}
			}

		};
		
		
		Runnable task2 = () -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int under10;
			for(under10=0; under10<10; under10++) {
				//System.out.println(under10);
				String name2 = Thread.currentThread().getName();
				System.out.print(name2 + " : " + under10 + " ");
				System.out.println();
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("20 미만 짝수 :"+ thread1.currentThread().getName());
		System.out.println("10 미만 수 :"+ thread2.currentThread().getName());
		
	}
}

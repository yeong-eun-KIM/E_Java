package kr.co.ezenac.thread03;

import java.io.IOException;

public class TerminateThread  extends Thread {

	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(!flag) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(getName() + " end");
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in =='A') {
				threadA.setFlag(true);
			}
			else if(in=='B') {
				threadB.setFlag(true);
			}
			else if(in =='C') {
				threadC.setFlag(true);
			}
			else if(in == 'F') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				System.out.println("모두 종료");
				break;
			}
			else {
				System.out.println("다시 입력");
			}
			
		}
		
		
	}
	
}

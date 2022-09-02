package kr.co.ezenac.loop03;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		for(i = 1; ; i++) {
			sum += i;
			
			if(sum>=100) break;						

				}
		
		System.out.println("100이 넘는 순간의 i : " + i);
		System.out.print("100이 넘는 순간의 합 : "+sum);

		}
	}



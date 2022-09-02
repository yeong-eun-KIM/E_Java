package kr.co.ezenac.loop;

//누적합계가 2000이상 일 때 i의 값을 출력하시오.

public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0; //누적합계를 나타낼 변수
		int temp = 0; // 누적합계가 x일때 i를 나타낼 변수
		
		for (int i = 1; i <=100; i++) {
			sum += i;
			if (sum >= 2000) {
				temp = i;
				break;				//감싸고 있는 제어문의 블록을 빠져 나오는 기능
			}
		}
		
		System.out.println("누적합계가 2000 이상 일 때 i의 값 : " + temp);
		System.out.println("누적합계가 2000 이상 일 때 i의 합 : " + sum);
	}

}

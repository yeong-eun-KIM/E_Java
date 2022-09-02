package kr.co.ezenac.loop;

//1~10까지 더한 결과 출력하세요.
public class ForTest03 {
	
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for (int i = 0; i < 10; i++/* , count++ */) {
			sum += count;
			count++;
		}
		System.out.println(sum);
	
		System.out.println("======================");
		
		count = 1;
		sum = 0;
		
		/*
		 * for문의 문장들은 생략가능함
		 * 	1) 초기화식 생략
		 * 		- 이미 이전에 값이 초기화 되어 for 내부에서 값을 지정할 필요가 없는 경우
		 */
		int i = 0;
		for( ; i <10; i++) {
			sum += count;
			count++;
		}
		System.out.println(sum);
		System.out.println("======================");
		
		/*
		 * 	2) 조건식 생략
		 * 		- 반복 수행에 대한 조건이 수행문 내부에 있는 경우
		 */
		count = 1;
		sum = 0;
		
		for (i = 0; ; i++) {
			sum += i;
			if(i >= 10) break;
			
		}
		System.out.println(sum);
		System.out.println("======================");
		
		/*
		 * 	3) 증감식 생략
		 * 		- 증감식에 대한 연산이 복잡하거나 다른 변수의 연산 결과값에 결정되는 경우
		 */
		count = 1;
		sum = 0;
		for(i=0;i<=10; ) {
			sum += i;
			i++;			
		}
		System.out.println(sum);
		System.out.println("======================");	
		
//		for ( ; ; ) {
//			//무한반복
//		}
		
	}

}

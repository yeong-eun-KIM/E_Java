package kr.co.ezenac.lamda02;

public class TestMyNumber {

		public static void main(String[] args) {
			//람다식을 인터페이스 자료형 max 변수에 대입함
			MyNumber max = (x, y) -> {return x>y? x : y;};
			
			//인터페이스 자료형 변수로 함수 호출
			System.out.println(max.getMax(10, 20));
		}
}

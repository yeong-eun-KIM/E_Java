package kr.co.ezenac.decision04;

public class RandomTest {

	public static void main(String[] args) {
		
		
		//Math.random() 값은 0.000000 ~ 0.999999 사이의 값을 발생시킴
		System.out.println(Math.random());
		
		//주사위 숫자
		int num = (int)(Math.random()*6); //0~5까지 출력
		num = (int)(Math.random()*6)+1;   //1~6까지 범위의 수를 발생시키는 식
		System.out.println(num);
		
		//로또 : 1~ 45
		int num2 = (int)(Math.random()*45)+1;
		System.out.println(num2);
		
		if(num ==1) {
			System.out.println("1이 나왔네요!");
		} else if (num==2) {
			System.out.println("2가 나왔네요!");
		} else if (num==3) {
			System.out.println("3이 나왔네요!");
		} else if (num==4) {
			System.out.println("4가 나왔네요!");
		} else if (num==5) {
			System.out.println("5가 나왔네요!");
		} else {
			System.out.println("6이 나왔네요!");
		}
		
		// 위의 if문을 switch문으로 바꿔보세요.
		
		switch (num) {
		case 1:
			System.out.println("1이 나왔네요!");
			break;
		case 2:
			System.out.println("2가 나왔네요!");
			break;	
		case 3:
			System.out.println("3이 나왔네요!");
			break;
		case 4:
			System.out.println("4가 나왔네요!");
			break;
		case 5:
			System.out.println("5가 나왔네요!");
			break;
		case 6:
			System.out.println("6이 나왔네요!");
			break;	
			
		}
		
	}

}

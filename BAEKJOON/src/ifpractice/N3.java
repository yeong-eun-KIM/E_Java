package ifpractice;
import java.util.Scanner;

public class N3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if(year>0 && year<4000) {
		if((year%4==0 && !(year%100==0)) || (year%400==0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		}
		else {
			System.out.println("잘못된 범위입니다.");
		}
	}
}

package ifpractice;
import java.util.Scanner;

public class N2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(0<=score && score<101) {
		if(score>=90 && score <=100) {
			System.out.println('A');
		} else if(score>=80 && score <=89){
			System.out.println('B');
		}else if(score>=70 && score <=79) {
			System.out.println('C');
		}else if(score>=60 && score <=69) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
		}
		else {
			System.out.println("잘못된 범위입니다.");
		}
		scan.close();
	}
}

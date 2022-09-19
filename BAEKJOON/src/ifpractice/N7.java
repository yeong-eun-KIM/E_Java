package ifpractice;
import java.util.Scanner;

public class N7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a==b && b==c && c==a) {
			System.out.print(10000 + a*1000);
		} else {
			if((a==b || b==c)) {
				
			} else {
				
			}
		}
		
		scan.close();
	}
}

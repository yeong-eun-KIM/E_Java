package ifpractice;
import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요 : ");
		int A = scan.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		int B = scan.nextInt();

			if(A>B) {
				System.out.println(">");
			} else if(A<B) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		
		
		scan.close();
	}
}

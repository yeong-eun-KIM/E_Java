package ifpractice;
import java.util.Scanner;

public class N5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		if((23>=h && 0<=h) && (59>=m && 0<=m)) {
			if(h==0) {
				h=24;
				}
			if (m>46 && m<59) {
				System.out.println(h +" "+ (m-25));
			} else {
				System.out.println((h-1)+" "+(m+15));			
				}
			}			
		else {
			System.out.println("잘못된 범위입니다.");
		}
	
		scan.close();
	}
}

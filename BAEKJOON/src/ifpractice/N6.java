package ifpractice;
import java.util.Scanner;

public class N6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int t = scan.nextInt();
		if((m+t)>=60) {
			if(h<=8 && m<=19) {
				h=((m+t)/60)+h;
				m=((m+t)%60)+m;
			} else {
				h = 
			}
			
		} else {
			m = m+t ;
		}
		System.out.println(h+" "+m);
		scan.close();
	}
}

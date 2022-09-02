package kr.co.ezenac.loop02;

public class XTest {

	public static void main(String[] args) {
		
//		int x = 1; 
// 		int y = 5;
// 		
// 		for ( ;x<6;x++) {
// 			for ( ;y>0;y--) 

		int x = 1;
		int y = 5;
		
		for(int i =1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++) {
				if(j == x||j==y){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			} 
			System.out.println();
			x++;
			y--;
		}
		
 				
	}
}
		

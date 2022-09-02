package kr.ac.ezenac.operator;

public class AssignmentTest {

	public static void main(String[] args) {
		short num = 10;
		num += 77L;
		System.out.println(num);
		
		num = (short)(num +77L);
		System.out.println(num);

	}

}

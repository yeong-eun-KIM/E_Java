package kr.co.ezenac.lamda04;

public class TriFunctionTest {

	public static void main(String[] args) {
		
		TriFunction<Integer, Integer, Integer, Integer> add = (x,y,z)->{return x+y+z;};
		
		int result = add.apply(1, 2, 3);
		System.out.println(result);
	
		
	}

}

package kr.co.ezenac.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("sql");
		System.out.println(System.identityHashCode(buffer));
		
		System.out.println(buffer); //새로운 인스턴스를 생성하지 않고 기존 인스턴스에서 만들어짐
		
	}
	
}

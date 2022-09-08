package kr.co.ezenac.exception;

public class AutoCloseableTest implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
		
	}

}

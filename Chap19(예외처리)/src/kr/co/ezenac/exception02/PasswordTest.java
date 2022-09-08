package kr.co.ezenac.exception02;

public class PasswordTest {
	
	private String password;
	
	public void setPassword(String password) throws PasswordException {
		if(password==null)
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		else if (password.length()<5)
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "ezen";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}

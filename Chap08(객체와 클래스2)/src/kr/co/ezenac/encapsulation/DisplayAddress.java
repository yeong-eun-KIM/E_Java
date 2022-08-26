package kr.co.ezenac.encapsulation;


/*
 *  단계별로 생성해서 원하는 결과물을 얻는 생성
 *   = 메서드를 따로 생성하고 조합하여 결과물을 생성
 */

public class DisplayAddress {
	
	StringBuffer buffer = new StringBuffer();
	private String line = "======================================\n";
	private String tilte = "이름\t	주소\t	전화번호	\n";
	
	private void makeHeader () {
		buffer.append(line);
		buffer.append(tilte);
		buffer.append(line);
	}
	
	private void makeBody () {
		buffer.append("이순신 \t");
		buffer.append("서울 강남구 \t");
		buffer.append("010-1234-5678\n");
		
		buffer.append("신사임당 \t");
		buffer.append("서울 서초구 \t");
		buffer.append("010-5678-1234\n");		
		
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}
	
	
}

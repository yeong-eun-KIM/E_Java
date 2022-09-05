package kr.co.ezenac.string;

public class TextBlockTest {

	public static void main(String[] args) {
		
		String textBlock = """	
				This is a typhoon.
				비가 오늘 계속 온다고 합니다.
				내일도...
				기온이 많이 내려 가겠죠.
				
				"""; //java 13이상에서 적용
		
		System.out.println(textBlock);
		System.out.println(getTextBlockofHTML());
		
	}
	
	public static String getTextBlockofHTML() {
		return """
				<html>
					<body>
						<span> GoodBye Typhoon!<span>
					</body>
				</html>
				""";
	}
	
	
	
}

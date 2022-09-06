package kr.co.ezenac.set;


public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet hashSet = new MemberHashSet();
						
			Member memberL = new Member(2022, "이순신");
			Member memberW = new Member(2023, "원균");
			Member memberR = new Member(2024, "나대용");
			Member memberS = new Member(2025, "류성룡");
			
			hashSet.addMember(memberL);
			hashSet.addMember(memberW);
			hashSet.addMember(memberR);
			hashSet.addMember(memberS);
			
//			hashSet.showAllMember();
		
			Member memberL2 = new Member(2025, "이도");
			hashSet.addMember(memberL2);
			hashSet.showAllMember();
			
	}
	
}

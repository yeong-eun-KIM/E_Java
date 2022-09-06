package kr.co.ezenac.set02;


public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		memberTreeSet.addMember(memberL);
		memberTreeSet.addMember(memberW);
		memberTreeSet.addMember(memberR);
		memberTreeSet.addMember(memberS);
		
		memberTreeSet.showAllMember();
		
	}

}

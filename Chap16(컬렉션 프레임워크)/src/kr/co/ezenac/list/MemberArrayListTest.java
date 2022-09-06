package kr.co.ezenac.list;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberR);
		memberArrayList.addMember(memberS);
		
		memberArrayList.showMembers();
				
		memberArrayList.removeMember(memberW.getMemberId());
		
		memberArrayList.showMembers();
		
		memberArrayList.removeMember(memberS.getMemberId());
		
		
		
		
	}

}

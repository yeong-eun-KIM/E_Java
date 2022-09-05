package kr.co.ezenac.list;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arraylist;
	
	public MemberArrayList() {
		arraylist = new ArrayList<>();
		
		
	}

	public void addMember(Member member) {
		arraylist.add(member);
		
		
	}
	
	public boolean removeMember(int memberId) {
		//해당 아이디를 가진 멤버를 ArrayList에서 찾아서 삭제해야함
		// 일치하면 삭제, 아니면 존재하지 않음으로 알려줌
	
		for(int i=0;i<arraylist.size();i++) {
			Member member = arraylist.get(i);
			//멤버아이디가 매개변수와 일치하면 삭제
			int temp = member.getMemberId();
			if(temp == memberId) {
				arraylist.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	
	public void showMembers() {
		for(Member member : arraylist) {
			System.out.println(member);		
		}
		System.out.println();
	}
	
}

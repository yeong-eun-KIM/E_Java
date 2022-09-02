package kr.co.ezenac.interfacee3;

public class LeastCall implements Distribution{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 상담업무가 없는 상담원으로 배분합니다.");
		
	}

	@Override
	public void sendCallAgent() {
		System.out.println("현재 상담대기가 가장 적은 상담원에게 할당합니다.");
		
	}

}

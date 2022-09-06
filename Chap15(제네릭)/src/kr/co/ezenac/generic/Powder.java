package kr.co.ezenac.generic;

public class Powder extends Material {
	@Override
	public String toString() {
		
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("Powder 재료로 출력합니다.");
		
	}
}

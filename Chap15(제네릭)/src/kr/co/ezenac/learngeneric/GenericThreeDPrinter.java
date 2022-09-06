package kr.co.ezenac.learngeneric;

public class GenericThreeDPrinter<T> {
	
	private T material;				//T자료형으로 선언한 (참조)변수

	public T getMaterial() {		//T자료형을 반환하는 제네릭 메서드
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	

	@Override
	public String toString() {
		
		return material.toString();
	}
	
}

package kr.co.ezenac.array2;

class BoxA4{
	public String name;
	public BoxA4 (String name) {
		this.name =name;
	}
}


public class BoxArray {
	public static void main(String[] args) {
		
		
		BoxA4[] arr = new BoxA4[3];
		
		//배열에 객체 저장(초기화)
		arr[0]=new BoxA4("이순신");
		arr[1]=new BoxA4("이순신1");
		arr[2]=new BoxA4("이순신2");
		
		//저장된 객체의 참조
		System.out.println(arr[0].name);
		System.out.println(arr[1].name);
		System.out.println(arr[2].name);
	}
}

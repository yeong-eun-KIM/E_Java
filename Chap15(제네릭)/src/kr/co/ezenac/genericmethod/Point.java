package kr.co.ezenac.genericmethod;

/*
 * 두 점을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드를 만드시오.
 * 	- 두 점은 정수인 경우도 있고, 실수인 경우도 있으므로 제네릭 타입 사용하여 구현함.
 */


public class Point<T, V> {
	
	
	T x;
	V y;
	
	Point(T x,V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
	
	
}

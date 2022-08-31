package kr.co.ezenac.inheritance;

public class Triangle extends Shape {

	Point[] point;				//객체배열
	
	public Triangle() {
		 this(new Point(0, 0),new Point(50, 50), new Point(100, 100));
	}
	
	public Triangle(Point point,Point point2, Point point3) {
		System.out.println("Triangle의 매개변수 3개 있는 생성자 호출");
		this.point = new Point[] {point, point2, point3};
	}
	
	public Triangle(Point[] point) {
		System.out.println("Triangle의 매개변수 point 배열 생성자 호출");
		this.point = point;
	}
	
	
	@Override
	public void draw() {
		System.out.println("[point1] : "+ this.point[0].x+", "+ this.point[0].y
							+" [point2] : "+ this.point[1].x+", "+ this.point[1].y
							+" [point3] : "+ this.point[2].x+", "+ this.point[2].y);
	}
	
}


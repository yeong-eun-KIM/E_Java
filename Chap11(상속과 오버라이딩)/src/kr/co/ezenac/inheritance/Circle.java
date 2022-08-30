package kr.co.ezenac.inheritance;


	public class Circle extends Shape {
		
	Point center;	
	int radius;
	
	public Circle() {
		this(new Point(0, 0), 100); //독립클래스인 Point를 데려옴 & this()호출
	}

	public Circle(Point center, int radius) {
		//super();
		System.out.println("Circle 클래스의 매개변수가 있는 생성자 호출");
		this.center = center;
		this.radius = radius;
	}
	
	@Override
		public void draw() {
			System.out.println("색깔 : " + color);
			System.out.println("원점 : (x " + this.center.x+", y : "+this.center.y+", 반지름 : "+this.radius +")");
			super.draw();
			
		}
	
}

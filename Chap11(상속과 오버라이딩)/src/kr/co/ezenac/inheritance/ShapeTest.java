package kr.co.ezenac.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		System.out.println();
		
//		삼각형 
//		new Triangle(null)을 이용하여 삼각형 만들기
		
//		*막힌 부분*
//		Triangle triangle2 = new Triangle(null); 
//		까지 불러왔으나 null에 무엇을 넣어야 하는지?     -①
//		삼각형 좌표를 배열을 이용하여 어떻게 찍어야 할 지?		-②
//		*solution*
//		point 함수를 데려와서 배열로 만들고 생성자를 이용해서 값을 할당함 -②
//		변수를 null에 넣어줌 -①
		
		
		Point[] points = new Point[] {new Point(10, 10),new Point(80, 100), new Point(20, 120) };
		Triangle triangle2 = new Triangle(points);
		triangle2.draw();

			}

}

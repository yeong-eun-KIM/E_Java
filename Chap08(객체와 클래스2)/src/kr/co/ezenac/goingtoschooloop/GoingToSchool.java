package kr.co.ezenac.goingtoschooloop;

public class GoingToSchool {

	public static void main(String[] args) {
		
		Student student = new Student("이순신", 5000);
		Student student2 = new Student("신사임당", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subway9 = new Subway(9);
		
		student.takeBus(bus100);
		student2.takeSubway(subway9);
		
		student.showInfo();
		student2.showInfo(); 
		bus100.showInfo();
		subway9.showInfo();

	}

}

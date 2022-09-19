package kr.co.ezenac.project.grade;

public class MajorEvalution implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		String grade;
		
		if (score>=95 && score <= 100) {
			grade= "S";
		}
		else if (score>=90 && score <= 94) {
			grade = "A";
		}
		else if (score>=80 && score <= 89) {
			grade = "B";
		}
		else if (score>=70 && score <= 79) {
			grade = "C";
		}
		else if (score>=60 && score <= 69) {
			grade = "D";
		}
		else {
			grade ="F";
		}
		
		return grade;
	}

}

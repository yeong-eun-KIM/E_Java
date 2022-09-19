package kr.co.ezenac.project.school.view;

import java.util.ArrayList;

import kr.co.ezenac.project.grade.BasicEvalution;
import kr.co.ezenac.project.grade.GradeEvaluation;
import kr.co.ezenac.project.grade.MajorEvalution;
import kr.co.ezenac.project.grade.PFEvalution;
import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.utils.Constant;

public class GenerateGradeDisplay {
	School school = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과 >>>\n";
	public static final String LINE = "-------------------------------------------------\n";
	public static final String HEADER = "이름\t\t학번 \t\t필수 \t점수 \t학점 \n";
	public static final String LINE2 = "================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		
		ArrayList<Subject> subjects =  school.getSubjects();			//모든 과목에 대한 학점계산
		for(Subject subject : subjects ) {
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
		}
		
		return buffer.toString();
		
	}

	public void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size();i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			
			if(student.getStudentName().length()>=6) {
				buffer.append("\t");
			}
			else {
				buffer.append("\t\t");
			}
			
			buffer.append(student.getStudentId());
			buffer.append("  \t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("  \t");
			GetScoreGrade(student, subject.getSubjectId());
			buffer.append("\n");
			
			
		}
		
		
		buffer.append(GenerateGradeDisplay.LINE2);
		
	}

	public void GetScoreGrade(Student student, int subjectId) {
			ArrayList<Score> scoreList = student.getScores();
			int majorId = student.getMajorSubject().getSubjectId();
			
			GradeEvaluation[] gradeEvaluations = {new BasicEvalution(), new MajorEvalution(), new PFEvalution()};
			
			for(int i=0;i<scoreList.size();i++) {
				Score score = scoreList.get(i);
				
				if(score.getSubject().getSubjectId() == subjectId) {
					String grade;
					if(score.getSubject().getSubjectId() == majorId) {
						grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore());
					}
					else {
						
						grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore());
					}
					if (score.getSubject().getSubjectId() == Constant.GOLF) {
						grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
					}
						
					
					buffer.append(score.getScore());
					buffer.append("\t");
					buffer.append(grade);
				}
			}
			
	}

	public void makefooter(Subject subject) {
		buffer.append("\n");
	}

	public void makeHeader(Subject subject) {
		buffer.append("\t"+ subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
		
	}
	
}

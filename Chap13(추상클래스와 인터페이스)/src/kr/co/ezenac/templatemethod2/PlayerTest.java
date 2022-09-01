package kr.co.ezenac.templatemethod2;

import java.util.Scanner;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		System.out.println("Beginner/Intermediate/Advanced 중 레벨을 입력하세요>");
		Scanner level = new Scanner(System.in);
		String input = level.nextLine();
		
		while(!input.equals("Beginner") 
				&& !input.equals("Intermediate") 
				&& !input.equals("Advanced")) 
			{
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("Beginner/Intermediate/Advanced 중 레벨을 입력하세요>");
			input = level.nextLine();
			}
		
		if(input.equals("Beginner")) {
			PlayerLevel Beginner = new BeginnerLevel();
			Beginner.go();
		} else if(input.equals("Intermediate")) {
			PlayerLevel Intermediate = new IntermeditateLevel();
			Intermediate.go();
		} else {
			PlayerLevel Advanced = new AdvancedLevel();
			Advanced.go();
			}
			
		
	}
	
}

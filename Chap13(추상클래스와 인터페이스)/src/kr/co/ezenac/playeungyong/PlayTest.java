package kr.co.ezenac.playeungyong;

import java.util.Scanner;

import kr.co.ezenac.templatemethod3.IntermediateLevel;
import kr.co.ezenac.templatemethod3.PlayerLevel;

public class PlayTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("player 레벨을 선택해주세요 (1.초보자 | 2.중급자 | 3.상급자) : ");
		int level = input.nextInt();
		
		
		if(level == 1) {
			kr.co.ezenac.playeungyong.PlayerLevel b = new BeginnerLevel();
			b.showMessage();
		} else if (level ==2) {
			PlayerLevel i = new IntermediateLevel();
			i.showMessage();
		} else if (level ==3) {
			kr.co.ezenac.playeungyong.PlayerLevel a = new AdvancedLevel();
			a.showMessage();
		}
		
		Player player = new Player();
		System.out.print("점프 횟수를 입력해주세요 : ");
		int count = input.nextInt();
		player.play(count);
		
		System.out.print("{player 레벨을 올리시겠습니까? (y/n) : ");
		int levelup = input.nextInt();
		if(levelup == 'y') {
		
			kr.co.ezenac.playeungyong.PlayerLevel ilevel = new kr.co.ezenac.playeungyong.IntermediateLevel();
			player.upgradeLevel(ilevel);
			System.out.print("중급자 레벨이 되었습니다.");
	
			System.out.println("게임을 이어서 진행하시겠습니까? (y/n) : ");
				if(levelup == 'y') {
					System.out.print("{player 레벨을 올리시겠습니까? (y/n) : ");
						if(levelup == 'y') {
							int levelup2 = input.nextInt();
								kr.co.ezenac.playeungyong.PlayerLevel alevel = new AdvancedLevel();
								player.upgradeLevel(alevel);
								System.out.print("상급자 레벨이 되었습니다.");}
						else {}
			int keep = input.nextInt();
			if(keep == 'y') {
				System.out.print("{player 레벨을 올리시겠습니까? (y/n) : ");
				
			} else if (keep =='n') {
				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
			}
		}
			else {System.out.println("이미 최대 레벨입니다.");}
		else if (levelup == 'n') {
				
		} else {
				System.out.println("잘못된 입력입니다.");
		}
			
			System.out.println("게임을 종료합니다.");	
			input.close();
		} 
	
	
}

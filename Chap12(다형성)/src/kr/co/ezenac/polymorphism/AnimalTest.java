package kr.co.ezenac.polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void checkDownCast(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Dog) {
				Dog danimal = (Dog)animal; // 다운캐스팅
				danimal.playBall(); 
				}
			else if (animal instanceof Tiger) {
					Tiger tanimal = (Tiger)animal;
					tanimal.hunt();
			}
			else if (animal instanceof Eagle)	{
					Eagle eanimal = (Eagle)animal;
					eanimal.pickUpFish();
			}
			else {
						System.out.println("ERROR");
			}														
		}
		
		
	}
	
	public void eat() {
		System.out.println("동물이 먹습니다.");
	}

}

class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("개가 네발로 걷습니다.");
	}
	
	public void playBall() {
		System.out.println("개가 견주가 던진 공을 물어옵니다."); //확장된 기능
	}
	
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void pickUpFish() {
		System.out.println("독수리가 물고기를 채갑니다.");
	}
	
}

public class AnimalTest {
	
	public void moveAnimal (Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		Animal danimal = new Dog();		 //업캐스팅이 이뤄짐
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();
		System.out.println();
		
		ArrayList<Animal> animalist = new ArrayList<>();
		animalist.add(danimal);
		animalist.add(tanimal);
		animalist.add(eanimal);
		
		for(Animal animal : animalist) {
			animal.move();
			
			}		//다형성, 하나의 코드로 다양한 케이스를 커버가능
		System.out.println();		
		
		}

	
	}

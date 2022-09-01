package kr.co.ezenac.abstractclass;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();	//다형성
		computer.display();
		computer.turnOff();
		
		
		NoteBook noteBook = new MyNoteBook();
		noteBook.typing();
		
	}

}

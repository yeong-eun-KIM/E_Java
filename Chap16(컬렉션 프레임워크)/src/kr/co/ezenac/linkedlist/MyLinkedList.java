package kr.co.ezenac.linkedlist;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		
		if(head == null) {
		newNode = new MyListNode(data);
		head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) 
				temp = temp.next;
			temp.next = newNode;			
		}
		
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 : " + count + "개 입니다.");
			return null;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			
		}
		else {
			MyListNode preNode = null;
			for(i=0;i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		if(position>= count) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 "+count+"개 입니다.");
			return null;
		}
		
		if(position == 0) {
			head = tempNode.next;
		} 
		else {
			MyListNode preNode = null;
			for(i=0;i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
		
			preNode.next = tempNode.next;
			
		}
		count --;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public void removeAll() {
		head = null;
		count = 0;
		
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}	
	
	public int getsize() {
		return count;
	}
	
}

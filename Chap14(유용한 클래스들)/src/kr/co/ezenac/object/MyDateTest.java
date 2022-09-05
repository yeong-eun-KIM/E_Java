package kr.co.ezenac.object;

import java.util.ArrayList;

/*
 * 날짜를 구현한 클래스(MyDate가 있습니다.)
 * 날짜가 같으면 equals() 메서드의 결과가 true가 되도록 구현하시오.
 * 
 * hashCode() 메서드도 구현하시오.
 */

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		//super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj; //다운캐스팅
			if(this.day==date.day && this.month==date.month && this.year==date.year) {
				return true;
			}
			else return false;
		}
		
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
			
		return day*10 + month*101 + year+1001; 
	}

}

public class MyDateTest {
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(5,9,2022);
		MyDate date2 = new MyDate(5,9,2022);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
	}
}

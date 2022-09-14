package kr.co.ezenac.builder02;

import java.util.Objects;
/*
 * 뉴욕피자
 * 	- concreateBuilder (Builder에 선언된 메서드를 구현한 클래스)
 * 	- size 
 */
public class NyPizza extends Pizza {
	public enum Size {SAMLL, MEDIUM, LARGE};
	private final Size size;
	
	public static class Builder extends Pizza.Builder{
		private final Size size;
		
		
		public Builder(Size size) {
			//requiredNonNull() : 인자의 null 체크를 해주고 null이 아닐 때 그대로 반환
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		protected Builder self() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		Pizza build() {
			// TODO Auto-generated method stub
			return new NyPizza(this);
		}
		
	} 
	
	public NyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}

}

package kr.co.ezenac.builder02;


public class Calzone extends Pizza {
	private final boolean sauceInside;
	
	public Calzone(Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}

	
	public static class Builder extends Pizza.Builder{
		private boolean sauceInside = false;
		
		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}
		
		@Override
		protected Builder self() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		Pizza build() {
			// TODO Auto-generated method stub
			return new Calzone(this);
		}
		
	} 
	
	@Override
	public String toString() {
		return toppings.toString() +"sauceInside : "+ sauceInside;
	}
}

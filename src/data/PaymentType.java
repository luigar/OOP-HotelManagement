package data;

public 
	enum PaymentType {
		CC("Credit Card"),
		CASH("Cash"),
		DEBIT("Debit Card");

		private final String toString;

	    private PaymentType(String toString) {
	         this.toString = toString;
	    }

	    public String toString(){
	         return toString;
	    }
		
}

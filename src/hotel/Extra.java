package hotel;

import data.ExtraType;

public class Extra {

	private double price;
	private ExtraType type;

	public Extra() {
		// TODO - implement Extra.Extra
		//throw new UnsupportedOperationException();
	}
	
//Getters and Setters Methods

	    //Get Price
	    public double getPrice() {return price;}
	    
	   //Set Price
	    public void setPrice(double price) {this.price = price;}
	    
	    //Get Extras
	    public ExtraType getType() {return type;}
	     
	    //Set Extras
	    public void setType(ExtraType type) {this.type = type;}

	    //Constructor using @Params
	    public Extra(double price, ExtraType type) {this.price = price; this.type = type;} 
	    
	
}
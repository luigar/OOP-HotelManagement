package hotel;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import data.PaymentType;
//import data.Discount;

public class Payment {

	private String id;
	private PaymentType paymentType;
	private Booking booking;
	private Date paymentDate;
	double roomRate, discount, tax, total;

	Calendar Cal = Calendar.getInstance();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //Creating a date format for dates displayed
	DecimalFormat df = new DecimalFormat("0.00"); //Creating a decimal format for price displays
	
	public Payment() {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

	public double calcSubtotal() {
	    //Set the variable value
	  	double initialRoomRate = 0;
	  	
	  	//Loop
	      for(Extra extraPrice:booking.extras)
	      {
	          //Calculate the partialRoomRate
	    	  initialRoomRate = initialRoomRate + extraPrice.getPrice();
	      }
	      
	      //Set the variable value.
	      
	      long daysDuration = booking.getCheckOutDate().getTime() - booking.getCheckInDate().getTime();
	      
	      //Set the days value
	      int days = (int) TimeUnit.MILLISECONDS.toDays(daysDuration);
	      
	      //Set the partialRoomRate
	      initialRoomRate = initialRoomRate + booking.getRoomRate();
	      
	      //calculate room rate
	      roomRate = days * initialRoomRate;
	      
	      
	      return roomRate; //Return the value
		//throw new UnsupportedOperationException();
	}

	public double calcTax() {
		
		tax = (roomRate - discount) * 0.035; //formula to calculate taxes
	      
	  	
	  	return tax; //Return total tax
	}

	public double calcTaxBeforeDiscount() {
		
		tax = roomRate * 0.035; //formula to calculate taxes
	      
	  	
	  	return tax; //Return total tax
	}

	public double calcDiscount() {
		switch(booking.discount)
	      {
	          case CAA:
	        	  //Calculate discount for CAA
	          				discount = roomRate * 0.10;
	          				break;
	          case GOV:
	        	  //Calculate discount for GOV
	          				discount = roomRate * 0.15;
	          				break;
	          case CUPON:
	        	  			//Calculate discount for CUPONS
      						discount = roomRate * 0.25;
      						break;    
	          case CASH:
  	  						//Calculate discount for CASH
	        	  			discount = roomRate * 0.13;
							break;   
					
	          default:
	        	  			//Calculate Special Discount
	          				discount = roomRate * 0.20;

	          	    
	      }
		  
	      return discount; //Return the discount
	}

	public double calcTotal() {
		total = roomRate - discount + tax;
	      
	  	
	  	return total; //Return total with discounts and taxes applied
	}

	public double amountPaid() {
		
		  	return total; //Return total 
		  }
	
	// Constructor using @Params
	  public Payment(String id,  Booking book, PaymentType paymentType )
	  {
	      
	  	//Set the id and payment type
	  	this.id = id;
	      this.paymentType = paymentType;
	      booking = book;
	      
	      System.out.println("*****************************************************\n");
	      
 	     
	      //Display all details
	      //LocalDateTime now = LocalDateTime.now();  
	      
	      System.out.println("\n============Employee Info=================\n");
	      System.out.println("Employee Code : "+booking.getGuest().getId());
	      System.out.println("Employee First Name : "+booking.getEmployee().getFirstName());
	      System.out.println("Employee Last Name : "+booking.getEmployee().getLastName());
	      System.out.println("Employee Phone : "+booking.getEmployee().getPhoneNumber());
	      
	      System.out.println("\n============Room Info=================\n");
	      System.out.println("CheckIn Date : "+booking.getCheckInDate());
	      System.out.println("CheckOut Date : "+booking.getCheckOutDate());
	      System.out.println("Days Reserved/Booked : "+booking.getStayNights());
	      System.out.println("");
	      System.out.println("Room Number : "+booking.getRoom().getRoomNumber());
	      System.out.println("Suite : "+booking.getRoom().isSuite());
	      System.out.println("Room Size : "+booking.getRoom().getSqFootage());
	      System.out.println("Room Rate : "+booking.getRoomRate());
	      
	      System.out.println("\n============Guest Info=================\n");
	      System.out.println("Guest Name: "+booking.getGuest().getFirstName()+" "+booking.getGuest().getLastName());
	      System.out.println("Credit Card : "+booking.getGuest().getCcNumber());
	      System.out.println("Address : "+booking.getGuest().getAddress());
	      System.out.println("Postal code : "+booking.getGuest().getPostalCode());
	      System.out.println("City : "+booking.getGuest().getCity());
	      System.out.println("Province : "+booking.getGuest().getProvince());
	      System.out.println("Phone : "+booking.getGuest().getPhoneNumber());
	      System.out.println("Email @: "+booking.getGuest().getEmailAddress());

	      
	      System.out.println("\n============Billing Info=================\n");
	      System.out.println("Payment Method : "+this.paymentType);
	      System.out.println("Payment Date : "+ (Cal.get(Calendar.MONTH) + 1) + "-" + Cal.get(Calendar.DATE) + "-" + Cal.get(Calendar.YEAR));
	      System.out.println("Room Total : "+ "(+) " +df.format(calcSubtotal()));
	      System.out.println("Discount : "+ "(-) " +df.format(calcDiscount()));
	      System.out.println("3.5% Hospitality Tax After Discount: "+ "(+) " +df.format(calcTax()));
	      System.out.println("3.5% Hospitality Tax Before Discount: "+ "(Informative) " +df.format(calcTaxBeforeDiscount()));
	      System.out.println("Final Price : "+ "(=) " +df.format(calcTotal()));
	      System.out.println("Total Paid : "+df.format(amountPaid()));
	      
	      System.out.println("\n*****************************************************");        
	  }

}
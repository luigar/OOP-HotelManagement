package hotel;

import java.util.Date;
import data.Discount;
import data.PaymentType;
import data.ExtraType;

public class Hotel {

	 public static void main(String[] args) {
	        
	        //Create hotel object
	    	HotelDB hotel = new HotelDB();
	    	
	        //Create an instances of Extra 
	        Extra fridge = new Extra(100, ExtraType.FRIDGE);
	        Extra microwave = new Extra(200, ExtraType.MICROWAVE);
	        Extra cot = new Extra(150, ExtraType.COT);
	        Extra towels = new Extra(5, ExtraType.EXTRATOWELS);
	        Extra coffee = new Extra(10, ExtraType.COFFEE_MAKER);
	        Extra internet = new Extra(0, ExtraType.INTERNET);
	        
	        
	        //Create the Object
	        Booking book1 = new Booking("B1111", hotel.getGuestList().get(0), hotel.getRoomList().get(0), hotel.getEmployeeList().get(0), new Date(89,06,27), new Date(89,06,30), 1000, Discount.CASH);
	        //Add the Extra
	        	book1.addExtra(fridge);
	        	book1.addExtra(microwave);
	        	book1.addExtra(internet);
	        	book1.addExtra(towels);
	        
	        //Create the Object
	        Booking book2 = new Booking("B2222", hotel.getGuestList().get(1), hotel.getRoomList().get(1), hotel.getEmployeeList().get(1), new Date(89,06,22), new Date(89,06,25), 1200, Discount.GOV);
	        	book2.addExtra(fridge);
	        	book2.addExtra(internet);
	        
	        //Create the Object
	        Booking book3 = new Booking("B3333", hotel.getGuestList().get(2), hotel.getRoomList().get(2), hotel.getEmployeeList().get(2), new Date(89,06,19), new Date(89,06,22), 1300, Discount.CUPON);
	        	book3.addExtra(cot);
	        
	        //Create the Object
	        Booking book4 = new Booking("B4444", hotel.getGuestList().get(3), hotel.getRoomList().get(3), hotel.getEmployeeList().get(3), new Date(89,06,11), new Date(89,06,15), 1200, Discount.CAA);
	        	 book4.addExtra(microwave);
	        	 book4.addExtra(fridge);
	        	 book4.addExtra(internet);
	        	 book4.addExtra(coffee);
	       
	        //Create the Object
	        Booking book5 = new Booking("B5555", hotel.getGuestList().get(4), hotel.getRoomList().get(4), hotel.getEmployeeList().get(4), new Date(89,06,22), new Date(89,06,25), 1100, Discount.SPECIAL);
	        	book5.addExtra(fridge);
	        	book5.addExtra(microwave);
	        	book5.addExtra(towels);
	        	book5.addExtra(coffee);
	        	book5.addExtra(internet);
	        
	        //Print the Guest List
	        hotel.displayGuest();
	        
	       
	        //Payment object
	        Payment payment1 = new Payment("P1111", book1, PaymentType.CASH);
	        Payment payment2 = new Payment("P2222", book2, PaymentType.CC);
	        Payment payment3 = new Payment("P3333", book3, PaymentType.CASH);
	        Payment payment4 = new Payment("P4444", book4, PaymentType.CC);
	        //Payment payment5 = new Payment("P5555", book5, PaymentType.DEBIT);
	        
	    }
	   
	}
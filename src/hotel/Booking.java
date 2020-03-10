package hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import data.Discount;

public class Booking {

	private String id;
	private Guest guest;
	private Room room;
	private Employee employee;
	private Date checkInDate;
	private Date checkOutDate;
	private double roomRate;
	
	Discount discount;

	public Booking() {
		// TODO - implement Booking.Booking
		//throw new UnsupportedOperationException();
	}
	
	//New Array
	List<Extra> extras = new ArrayList<Extra>();
	
//Getters and Setters Methods
	
	//Get ID
	public String getId() {return id;}
    
    //Set ID
    public void setId(String id) {this.id = id;}
    
    //Get Guest
    public Guest getGuest() {return guest;}
    
    //Set Guest
    public void setGuest(Guest guest) {this.guest = guest;}
    
    //Get Room
    public Room getRoom() {return room;}
    
    //Set Room
    public void setRoom(Room room) {this.room = room;}
    
   //Get Employee
    public Employee getEmployee() {return employee;}
    
   //Set Employee
    public void setEmployee(Employee employee) {this.employee = employee;}
    
   //Get Check In Date
    public Date getCheckInDate() {return checkInDate;}
    
   //Set Check In Date
    public void setCheckInDate(Date checkInDate) {this.checkInDate = checkInDate;}
    
   //Get Check Out Date
    public Date getCheckOutDate() {return checkOutDate;}
    
   //Set Check Out Date
    public void setCheckOutDate(Date checkOutDate) {this.checkOutDate = checkOutDate;}
    
   //Get Room Rate
    public double getRoomRate() {return roomRate;}
    
   //Set Room Rate
    public void setRoomRate(double roomRate) {this.roomRate = roomRate;}
    
   //Get Extras
    public List<Extra> getExtras() {return extras;}
    
   //Set Extras
    public void setExtras(List<Extra> extras) {this.extras = extras;}
    
   //Get Discount
    public Discount getDiscount() {return discount;}
    
   //Set Discount
    public void setDiscount(Discount discount) {this.discount = discount;}
    

   
    //Constructor using @Params
    public Booking(String id, Guest guest, Room room, Employee employee, Date checkInDate, Date checkOutDate, double roomRate, Discount discount) {
        this.id = id;
        this.guest = guest;
        this.room = room;
        this.employee = employee;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomRate = roomRate;
        this.discount = discount;
    }
    
    
    //AddExtra Method
    public void addExtra(Extra e)
    {
        extras.add(e);
    }
    
}
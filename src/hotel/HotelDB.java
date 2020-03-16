package hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;


import data.BedType;
import data.Province;

public class HotelDB {
	LocalDateTime dateTimeNow = LocalDateTime.now();
	LocalDate Emp1 = LocalDate.of(2020, 02, 01);
	/**
	 * 
	 * @param theRoom
	 */
	private List<Room> roomList = new ArrayList<Room>();
	
	public void addRoom(Room theRoom) {
		roomList.add(theRoom);
	}
	
	//Get Room List
    public List<Room> getRoomList() {
    	return roomList;
    	}
    //Set Room List
    public void setRoomList(List<Room> roomList) {
    	this.roomList = roomList;
    	}
    
    public void removeRoom(Room theRoom) {
    	roomList.remove(theRoom);
    	}

	/**
	 * 
	 * @param theEmployee
	 */
    private List<Employee> employeeList = new ArrayList<Employee>();
    
	public void addEmployee(Employee theEmployee) {
		employeeList.add(theEmployee);
		}
	
	//Return employeeList
    public List<Employee> getEmployeeList() {
    	return employeeList;
    	}
    
  //Set Employee list
    public void setEmployeeList(List<Employee> employeeList) {
    	this.employeeList = employeeList;
    	}
    
    public void removeEmployee(Employee theEmploye) {
    	employeeList.remove(theEmploye);
    	}
    
	/**
	 * 
	 * @param theGuest
	 */
    private List<Guest> guestList = new ArrayList<Guest>();
    
	public void addGuest(Guest theGuest) {
		guestList.add(theGuest);
		}	
	
	public List<Guest> getGuestList() {
		return guestList;
		}

	public void removeGuest(Guest theGuest) {
		guestList.remove(theGuest);
		}
	
	public void displayGuest()
    {
		
    }

//Building
	 @SuppressWarnings("deprecation")
	public HotelDB() {
		 
		 	//Create Employee Data
	        Employee employee1 = new Employee("999-999-999",new Date(92,12,28),"E001","Luis", "Garcia", "3 Armada Court", "E1A 0A3", "Moncton", Province.NEW_BRUNSWICK, "5065064545", "test01@gmail.com");    
	        Employee employee2 = new Employee("999-985-949",new Date(1992,12,28),"E002","Miguel", "Eduardo", "1111 Main Street", "E1A 0K9", "Moncton", Province.NEW_BRUNSWICK, "5075064545", "test02@gmail.com");
	        Employee employee3 = new Employee("999-999-999",new Date(85,03,13),"E003","Melissa", "Custodio", "1234 Mountain Road", "E1A 0J2", "Yellowknife", Province.NORTHERN_TERRITORIES, "5085064545", "test03@gmail.com");
	        Employee employee4 = new Employee("989-999-999",new Date(96,01,24),"E004","Virginia", "DelCarmen", "23 Elmwood Drive", "E1A 1X3", "Whitehorse", Province.YUKON, "5095064545", "test04@gmail.com");
	        Employee employee5 = new Employee("959-999-979",new Date(93,11,28),"E005","Gregorio", "Garcia", "76 Henessey Street", "E1A 2K7", "Saskatoon", Province.SASKATCHEWAN, "5105064545", "test05@gmail.com");
	        
	        //Insert Employee Data in the array
	        employeeList.add(employee1);
	        employeeList.add(employee2);
	        employeeList.add(employee3);
	        employeeList.add(employee4);
	        employeeList.add(employee5);
	        
	        Collections.sort(employeeList); //used to sort the elements present in the specified list of Collection in ascending order.
	        
	    	//Create Guest Data
	    	Guest guest1 = new Guest("4598962280606352","Will Settle Bill With Cash",true,"E002 ","Victoria", "Zeno", "12 Main Street", "M4V M4T", "Toronto", Province.ONTARIO, "5115064545", "test06@gmail.com");
	        Guest guest2 = new Guest("4562563383574703","Military Discount",false,"E003","Luis Ney", "Garcia Recio", "St. George", "E2H 1W4", "St. John",Province.NEW_BRUNSWICK, "5125064545", "test07@gmail.com");
	        Guest guest3 = new Guest("4136090838153070","Cupon Code",true,"E004","Sonia", "Minyety", "1234 Main Street", "A5A 0K9", "Clarenville", Province.NEWFOUNDLAND_AND_LABRADOR, "5135064545", "test08@gmail.com");
	        Guest guest4 = new Guest("4347970846762480","CAA Discount",false,"E001","Cody", "White", "45 August Drive", "H1A 0A1", "Montreal", Province.QUEBEC, "5145064545", "test09@gmail.com");
	        Guest guest5 = new Guest("4817907031450613","Spelcial Discount Payment",true,"E005","Yomira", "Custodio", "12 Main Streen", "C1A 0B1", "Charlottetown", Province.PRICE_EDWARD_ISLAND, "5155064545", "test10@gmail.com");
	       
	        
	        //Insert Guest Data in the array
	        guestList.add(guest1);
	        guestList.add(guest2);
	        guestList.add(guest3);
	        guestList.add(guest4);
	        guestList.add(guest5);
	        
	        Collections.sort(guestList); //used to sort the elements present in the specified list of Collection in ascending order.
	        
	        //Create Room Data
	        Room room1 = new Room("Room 101", "85", false, true, 1, BedType.SINGLE, true, false);
	        Room room2 = new Room("Room 102", "95", false, false, 2, BedType.DOUBLE, true, false);
	        Room room3 = new Room("Room 103", "85", false, true, 1, BedType.KING, true, false);
	        Room room4 = new Room("Suite 1", "120", true, true, 1, BedType.QUEEN, true, false);
	        Room room5 = new Room("Suite 2", "130", true, true, 1, BedType.SINGLE, true, false);
	
	        //Insert Room Data in the array
	        roomList.add(room1);
	        roomList.add(room2);
	        roomList.add(room3);
	        roomList.add(room4);
	        roomList.add(room5);
	        
	       // Collections.sort(roomList); //used to sort the elements present in the specified list of Collection in ascending order.
	 }
}
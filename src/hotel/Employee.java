package hotel;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import data.ExtraType;
import data.Province;

public class Employee extends Person implements Comparable<Employee>{

	private String sin;
	private Date dob;

	public Employee(){
		throw new UnsupportedOperationException();
	}
	 //Constructor using @Params
	  public Employee(String sin, Date dob, String id, String firstName, String lastName, String address, String postalCode, String city, Province prov, String phoneNumber, String emailAddress) {
	      super(id, firstName, lastName, address, postalCode, city, prov, phoneNumber, emailAddress);
	      this.sin = sin;
	      this.dob = dob;
	     // setBirthDate(dob);
}
	  //Get SIN
	    public String getSin() {return sin;}
	    
	   //Set SIN
	    public void setSin(String sin) {this.sin = sin;}
	    
	    //Get Date of Birth
	    public Date getDOB() {return dob;}
	     
	    //Set Date of Birth
	    public void setDOB(Date datetime) {this.dob = datetime;}
	    
	/*    public final void setBirthDate(Date date) {
	    	//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //Creating a date format for dates displayed
	        Calendar BDate = Calendar.getInstance();
	        
	    }*/
	    
	  @Override
	  public String toString() {
	      return "Employee{"+ "id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", address=" + getAddress() + ", postalCode=" + getPostalCode() + ", city=" + getCity() + ", province=" + getProvince() + ", phoneNumber=" + getPhoneNumber() + ", emailAddress=" + getEmailAddress()+ "sin=" + sin + ", dob=" + dob + '}';
	  }
	  

	  @Override
	  public int compareTo(Employee emp) {
	      return this.getFirstName().compareTo(emp.getFirstName());
	  }
}
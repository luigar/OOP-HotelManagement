package hotel;


import java.time.LocalDate;
import java.util.Date;

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
}
	  @Override
	  public String toString() {
	      return "Employee{"+ "id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", address=" + getAddress() + ", postalCode=" + getPostalCode() + ", city=" + getCity() + ", province=" + getProvince() + ", phoneNumber=" + getPhoneNumber() + ", emailAddress=" + getEmailAddress()+ "sin=" + sin + ", dob=" + dob + '}';
	  }
	  

	  @Override
	  public int compareTo(Employee emp) {
	      return this.getFirstName().compareTo(emp.getFirstName());
	  }
}
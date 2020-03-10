package hotel;

import data.Province;

public abstract class Person {

	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String postalCode;
	private String city;
	private Province province;
	private String phoneNumber;
	private String emailAddress;

	protected Person() {
		// TODO - implement Person.Person
		//throw new UnsupportedOperationException();
	}

//Getters and Setters Methods
		//Get the ID
		public String getId() {return id;}
	  
	  	//Set the ID
		public void setId(String id) {this.id = id;}

		//Get First Name
		public String getFirstName() {return firstName;}

		//Set First Name
		public void setFirstName(String firstName) {this.firstName = firstName;}
		
		//Get Last Name
		public String getLastName() {return lastName;}
		
		//Set Last Name
		public void setLastName(String lastName) {this.lastName = lastName;}

		//Get Address
		public String getAddress() {return address;}
		
		//Set Address
		public void setAddress(String address) {this.address = address;}
		
		//Get Postal Code
		public String getPostalCode() {return postalCode;}
		
		//Set Postal Code
		public void setPostalCode(String postalCode) {this.postalCode = postalCode;}

		//Get City
		public String getCity() {return city;}

		//Set City
		public void setCity(String city) {this.city = city;}

		//Get Province
		public Province getProvince() {return province;}

		//Set Province
		public void setProvince(Province province) {this.province = province;}
		
		//Get Phone Number
		public String getPhoneNumber() {return phoneNumber;}
		
		//Set Phone Number
		public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

		//Get Email
		public String getEmailAddress() {return emailAddress;}

		//Set Email
		public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

		//Constructor using @Params
	  public Person(String id, String firstName, String lastName, String address, String postalCode, String city, Province prov, String phoneNumber, String emailAddress) {
	      this.id = id;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.address = address;
	      this.postalCode = postalCode;
	      this.city = city;
	      province = prov;
	      this.phoneNumber = phoneNumber;
	      this.emailAddress = emailAddress;
	  }

	  @Override
	  public String toString() {
	      return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", postalCode=" + postalCode + ", city=" + city + ", province=" + province + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + '}';
	  }
	  

	}

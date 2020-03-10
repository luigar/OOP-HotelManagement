package hotel;

import data.Province;

public class Guest extends Person implements Comparable<Guest>{

	private String ccNumber;
	private String notes;
	private boolean isCheckedIn;

	public Guest() {
		// TODO - implement Guest.Guest
		//throw new UnsupportedOperationException();
	}
	
//Getters and Setters Methods	
	
	//Get Credit Card Number
    public String getCcNumber() {
		return ccNumber;
	}

    //Set Credit Card Number
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	
	//Get Notes
	public String getNotes() {
		return notes;
	}

	//Set Notes
	public void setNotes(String notes) {
		this.notes = notes;
	}

	//Boolean is Checked In 
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	//Set Checked In
	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}

	//Parameterized Constructor
    public Guest(String ccNumber, String notes, boolean isCheckedIn, String id, String firstName, String lastName, String address, String postalCode, String city, Province prov, String phoneNumber, String emailAddress) {
        super(id, firstName, lastName, address, postalCode, city, prov, phoneNumber, emailAddress);
        this.ccNumber = ccNumber;
        this.notes = notes;
        this.isCheckedIn = isCheckedIn;
    }

    @Override
    public int compareTo(Guest guest) {
        return this.getFirstName().compareTo(guest.getFirstName());
    }

    @Override
    public String toString() {
        return "Guest{"+ "id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", address=" + getAddress() + ", postalCode=" + getPostalCode() + ", city=" + getCity() + ", province=" + getProvince() + ", phoneNumber=" + getPhoneNumber() + ", emailAddress=" + getEmailAddress()+ "ccNumber=" + ccNumber + ", notes=" + notes + ", isCheckedIn=" + isCheckedIn + "}";
    }
    }

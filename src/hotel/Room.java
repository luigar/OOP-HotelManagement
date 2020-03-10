package hotel;

import data.BedType;

public class Room {

	private String roomNumber;
	private String sqFootage;
	private boolean isSuite;
	private boolean hasTV;
	private int numberOfBeds;
	private BedType typeOfBed;
	private boolean isClean;
	private boolean isRented;
	
	

	public Room() {
		// TODO - implement Room.Room
		throw new UnsupportedOperationException();
	}

	public void cleanRoom() {
		isClean = true;
		throw new UnsupportedOperationException();
	}
	
//Getters and Setters Methods

		//Get Room Number
		public String getRoomNumber() {return roomNumber;}

		//Set Room Number
		public void setRoomNumber(String roomNumber) {this.roomNumber = roomNumber;}

		//Get SqFootage
		public String getSqFootage() {return sqFootage;}

		//Set SqFootage
		public void setSqFootage(String sqFootage) {this.sqFootage = sqFootage;}

		//Boolean isSuite 
		public boolean isSuite() {return isSuite;}

		//Set the isSuite 
		public void setSuite(boolean isSuite) {this.isSuite = isSuite;}
	
		//Set the isHasTV
		public boolean isHasTV() {return hasTV;}

		//Set the isHasTV
		public void setHasTV(boolean hasTV) {this.hasTV = hasTV;}
		
		//Get Numbers of Beds
		public int getNumberOfBeds() {return numberOfBeds;}
		
		//Set the Number of beds
		public void setNumberOfBeds(int numberOfBeds) {this.numberOfBeds = numberOfBeds;}

		//Get type of Bed
		public BedType getTypeOfBed() {return typeOfBed;}

		//Set the type of Bed
		public void setTypeOfBed(BedType typeOfBed) {this.typeOfBed = typeOfBed;}

		public boolean isClean() {return isClean;}
		
		//Set the Clean
		public void setClean(boolean isClean) {this.isClean = isClean;}

		public boolean isRented() {return isRented;}
		
		//Set the Rent
		public void setRented(boolean isRented) {this.isRented = isRented;}
		
		//Constructor using @Params
	    public Room(String roomNumber, String sqFootage, boolean isSuite, boolean hasTV, int numberOfBeds, BedType typeOfBed, boolean isClean, boolean isRented) {
	        this.roomNumber = roomNumber;
	        this.sqFootage = sqFootage;
	        this.isSuite = isSuite;
	        this.hasTV = hasTV;
	        this.numberOfBeds = numberOfBeds;
	        this.typeOfBed = typeOfBed;
	        this.isClean = isClean;
	        this.isRented = isRented;
	    }

	
}
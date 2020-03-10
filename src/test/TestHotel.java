package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import hotel.Booking;
import hotel.Extra;
import hotel.Guest;

class TestHotel {
	Booking book = new Booking();
	Extra extra = new Extra();
	Guest guest = new Guest();

	@Test
	void testGetIDEquals() {
		book.setId("E001");
		assertEquals("E001", book.getId());
	}
	@Test
	void testGetIDNotEquals() {
		book.setId("E001");
		assertNotEquals("E005", book.getId());
	}
	@Test
	void testGetPriceEquals() {
		extra.setPrice(1250);
		assertEquals(1250, extra.getPrice());
	}
	@Test
	void testGetPriceNotEquals() {
		extra.setPrice(1250);
		assertNotEquals(1300, extra.getPrice());
	}
	@Test
	void testGetccNumberEquals() {
		guest.setCcNumber("9562452365874526");
		assertEquals("9562452365874526", guest.getCcNumber());
	}
	@Test
	void testGetccNumberNotEquals() {
		guest.setCcNumber("9562452365874526");
		assertNotEquals("9567652365874526", guest.getCcNumber());
	}
	@Test
	void testGetCityEquals() {
		guest.setCity("Moncton");
		assertEquals("Moncton", guest.getCity());
	}
	@Test
	void testGetCityNotEquals() {
		guest.setCity("Moncton");
		assertNotEquals("Frederincton", guest.getCity());
	}
	@Test
	void testGetFNameEquals() {
		guest.setFirstName("Luis");
		assertEquals("Luis", guest.getFirstName());
	}
	@Test
	void testGetFNameNotEquals() {
		guest.setFirstName("Luis Ney");
		assertNotEquals("Luis", guest.getFirstName());
	}
	@Test
	void testGetLNameEquals() {
		guest.setLastName("Garcia");
		assertEquals("Garcia", guest.getLastName());
	}
	@Test
	void testGetLNameNotEquals() {
		guest.setLastName("Garcia Victoria");
		assertNotEquals("Luis", guest.getLastName());
	}
}
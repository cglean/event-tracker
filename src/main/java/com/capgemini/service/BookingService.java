package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
	private static List<Booking> bookings = new ArrayList<Booking>();

	public List<Booking> retrieveBookings() {
		return bookings;
	}

	public void addBooking(Booking booking) {
		bookings.add(booking);
	}

	public void deleteBooking(Booking booking) {
		bookings.remove(booking);
	}
}

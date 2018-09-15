package com.capgemini.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-booking.do")
public class AddBookingServlet extends HttpServlet{

	
	private BookingService service = new BookingService();
	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String name = (String)request.getSession().getAttribute("name");
		String eventName = request.getParameter("eventName");
		
		Event event = todoService.retrieveEvent(eventName);
		if (null == event) {
			throw new RuntimeException("Event Not Found in Event Database");
		}
		Booking book = service.retrieveBookings().stream().filter
		(booking -> (booking.getName().equals(name)) && 
				booking.getEvent().getName().equalsIgnoreCase(eventName)).findFirst().orElse(null);
		
		
		if(null != book) {
			request.setAttribute("errorMsg", "User Already Registered");
			throw new RuntimeException("User Already Registered");
		}
		service.addBooking(new Booking(name, event));
		request.setAttribute("bookings", service.retrieveBookings());
		String context = request.getContextPath();
		response.sendRedirect(context + "/list-bookings.do");
	}

	
}

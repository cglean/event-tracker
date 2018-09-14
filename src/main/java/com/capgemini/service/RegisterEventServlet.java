package com.capgemini.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register-event.do")
public class RegisterEventServlet {

	private BookingService service = new BookingService();
	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String eventName = request.getParameter("eventName");
		
		
		Event event = todoService.retrieveEvent(eventName);
		if (null == event) {
			throw new RuntimeException("Event Not Found in Event Database");
		}
		service.addBooking(new Booking(email, event));
		
		response.sendRedirect("/list-bookings.do");
	}
}

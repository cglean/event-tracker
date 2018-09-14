package com.capgemini.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-bookings.do")
public class ListBookings extends HttpServlet{


	private BookingService service = new BookingService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("bookings", service.retrieveBookings());
		System.out.println("Bookings" +  service.retrieveBookings().toString());
		request.getRequestDispatcher("/WEB-INF/views/list-bookings.jsp").forward(
				request, response);
	}
}

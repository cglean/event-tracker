package com.capgemini.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//INITIALIZATION OF JSP
//CREATE add_002dtodo_jsp.java from add-todo.jsp
//compile add_002dtodo_jsp.java to add_002dtodo_jsp.class
//call _jspInit

//SERVICE -> _jspService

//DESTROY -> _jspDestroy

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		String eventTime = request.getParameter("eventTime");
		System.out.println("Event Time is " + eventTime);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateTime = LocalDate.parse(eventTime, format);
		String context = request.getContextPath();
		todoService.addTodo(new Event(newTodo, category, dateTime));
		response.sendRedirect(context + "/list-todos.do");
	}
}
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<%@ page errorPage="/WEB-INF/views/errorPage.jsp" %>  

<div class="container">
	<H1>Welcome ${name} to SpringOne 2017</H1>
<c:set var="context" value="${pageContext.request.contextPath}" />


	<table class="table table-striped">
		<caption>All Scheduled Events here</caption>
		<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Event Date</th>
			<th>Actions</th>
			<th>Register For Event</th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td>${todo.eventTime}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="${context}/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
					<td>&nbsp;&nbsp;<a class="btn btn-primary"
						href="${context}/add-booking.do?eventName=${todo.name}">Register</a></td>
				</tr>
				
				
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<a class="btn btn-success" href="${context}/add-todo.do">Add New Event</a>
</div>

<%@ include file="../common/footer.jspf"%>

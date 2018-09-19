<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${name} to SpringOne 2018</H1>


	<table class="table table-striped">
		<caption>All Bookings here</caption>
		<thead>
			<th>Name</th>
			<th>Description</th>
			
		</thead>
		<tbody>
			<c:forEach items="${bookings}" var="booking">
				<tr>
					<td>${booking.name}</td>
					<td>${booking.event.name}</td>
				</tr>
				
				
			</c:forEach>
		</tbody>
	</table>

	<p>
		<font color="red">${errorMessage}</font>
	</p>
</div>

<%@ include file="../common/footer.jspf"%>

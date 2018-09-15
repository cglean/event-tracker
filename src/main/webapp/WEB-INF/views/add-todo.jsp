<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>


<div class="container">
<c:set var="context" value="${pageContext.request.contextPath}" />

	Your New Action Item:
	<form method="POST" action="${context}/add-todo.do">
		<fieldset class="form-group">
			<label>Description</label> <input name="todo" type="text"
				class="form-control" /> <BR />
		</fieldset>
		<fieldset class="form-group">
			<label>Category</label> <input name="category" type="text"
				class="form-control" /> <BR />
		</fieldset>
		
		<fieldset class="form-group">
			<label>Event Time</label> <input name="eventTime" type="text"
				class="form-control" /> <BR />
		</fieldset>
		<input name="add" type="submit" class="btn btn-success" value="Submit" />
	</form>
</div>

<%@ include file="../common/footer.jspf"%>
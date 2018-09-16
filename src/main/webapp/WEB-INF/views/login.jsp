<%@ include file="../common/header.jspf"%>
<%@ page errorPage="/WEB-INF/views/errorPage.jsp" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	
<div class="container">
<c:set var="context" value="${pageContext.request.contextPath}" />

    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Sign in to continue to Event Tracker</h1>
            <div class="account-wall">
                <img class="profile-img" src="Murtaza.png"  alt="">
                <form class="form-signin" action="${context}/login.do" method="post">
                <p><font color="red">${errorMessage}</font></p>
                <input type="text" name="name" class="form-control" placeholder="name" required autofocus/>
                <input type="password" name="password" class="form-control" placeholder="password" required/>
                <button class="btn btn-lg btn-primary btn-block" type="submit" value="Login">
                    Sign in</button>
               
                </form>
            </div>
        </div>
    </div>
</div>
<%-- 	<div class="container">
		<form action="/login.do" method="post">
			<p>
				<font color="red">${errorMessage}</font>
			</p>
			Name: <input type="text" name="name" /> Password:<input
				type="password" name="password" /> <input type="submit"
				value="Login" />
		</form>

	</div> --%>

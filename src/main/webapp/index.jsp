<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="head.jsp"%>
<html>
<body>
<h2>User Display Exercise - Week 1</h2>


<%-- <a href = "searchUser">Go to the User Search</a> --%>


<form action="searchUser" method="GET">
    Last Name:<br />
    <input type="text" name="last_name" /><br />
    <br /><br />
    <input type="submit" name="" value="Enter" />
</form>


</body>
</html>

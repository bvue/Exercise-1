<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>


<html><body>

<%--TODO Pretty up the results!
<div class="container-fluid">
    <h2>Search Results: </h2>
    <p>${users}</p>
    </div>
--%>

    <table>
        <c:forEach var="userList" items="${users}">
            <tr>
                <td>
                    <c:out value="${userList}" />
                </td>
            </tr>
        </c:forEach>
    </table>




</body>
</html>

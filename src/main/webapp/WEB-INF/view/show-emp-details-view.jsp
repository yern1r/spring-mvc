<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 19.10.2023
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thank you!</title>
</head>
<body>

<h1>Thank you , for adding your name into database</h1>
<br>
<%--    your email is: ${param.employeeName}--%>

your name : ${employee.name}
<br><br>
your surname : ${employee.surname}
<br><br>
your salary : ${employee.salary}
<br><br>
your department: ${employee.departament}
<br><br>
your football club: ${employee.footballClub}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br><br>
Phone number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
<br><br>


</body>
</html>

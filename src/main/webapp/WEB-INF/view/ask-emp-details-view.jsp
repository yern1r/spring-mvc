<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Hi,there.</title>

</head>
<body>
<br>
<br>
<h1>Hi, our very valuable employer.</h1>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department<form:select path="departament">

    <form:options items="${employee.departments}"/>

<%--    <form:option value="Information Technologies" label="IT"/>--%>
<%--    <form:option value="Human resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>

    </form:select>
    <br><br>
    Your football club?

    <form:radiobuttons path="footballClub" items="${employee.footballClubs}"/>

<%--    Real Madrid <form:radiobutton path="footballClub" value="Real Madrid"/>--%>
<%--    Real Sociedad <form:radiobutton path="footballClub" value="Real Sociedad"/>--%>
<%--    Real Betis <form:radiobutton path="footballClub" value="Real Betis"/>--%>
    <br><br>
    Foreign Language(s):
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>


<%--    ENG <form:checkbox path="languages" value="English"/>--%>
<%--    RUS <form:checkbox path="languages" value="Russian"/>--%>
<%--    KAZ <form:checkbox path="languages" value="Kazakh"/>--%>
    <br><br>
    <input type="submit" value="GO">

</form:form>



<%--<h1>Can you write down your name?</h1>--%>

<%--<form action="showDetails" method="get">--%>
<%--    <input type = "text"  name="employeeName" placeholder="Write your email">--%>
<%--    <input type="submit">--%>
<%--</form>--%>
</body>
</html>

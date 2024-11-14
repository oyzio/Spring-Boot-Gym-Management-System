<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add a New Gym</title>
</head>
<body>

<h1>Add a New Gym</h1>

<form:form action="/addGym" modelAttribute="gym">
    <form:label path="classes">CLASSES:</form:label>
    <form:input path="classes"/><form:errors path="classes" errorCode="classesEmpty"/><br>

    <form:label path="website">WEBSITE:</form:label>
    <form:input path="website" type="url"/><form:errors path="website" errorCode="websiteEmpty"/><br>

    <form:label path="id">GYM ID:  :</form:label>
    <form:input path="id" type="number"/><form:errors path="id" errorCode="uniqueId"/><br>

    <button type="submit">Add a new gym</button>
</form:form>

<br>
<a href="/gyms">Back to Gym List</a>
</body>
</html>
<%-- <%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Add a New Gym</title>
</head>

<body>

<h1>Add a New Gym</h1>

<form action="/addGym" method="post">

    <label for="classes">CLASSES</label>
    <input type="text" id="classes" name="classes" value="${gym.classes}" required><br>

    <label for="website">WEBSITE</label>
    <input type="url" id="website" name="website" value="${gym.website}" ><br>

    <button type ="submit">Add a new gym</button>
</form>

<br>
<a href="/gyms">Back to Gym List</a>
</body>
</html>--%>
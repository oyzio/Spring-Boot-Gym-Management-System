<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add a new trainer</title>
</head>
<body>

<h2>Add a new trainer</h2>

<form:form action="/addTrainer" modelAttribute="trainer">
    <form:label path="name">Name:</form:label>
    <form:input path="name"/><form:errors path="name" errorCode="name"/><br>

    <form:label path="skills">Skills:</form:label>
    <form:input path="skills"/><form:errors path="skills" errorCode="skills"/><br>

    <form:label path="expertise">Expertise:</form:label>
    <form:input path="expertise"/><form:errors path="expertise" errorCode="expertise"/><br>

    <form:label path="duration">Duration:</form:label>
    <form:input path="duration" type="number"/><form:errors path="duration" errorCode="duration"/><br>

    <input type="hidden" name="gym" value="${gym}"/>

    <button type="submit">ADD TRAINER</button>
</form:form>

</body>
</html>
<%--<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<head>
    <title>Add a new trainer</title>
</head>

<body>

<h2>
    Add a new trainer
</h2>

<form action="/addTrainer" method="POST">

    <label for="name">Name: </label>
    <input type="text" id="name" name="name" value="${trainer.name}" required><br>

    <label for="skills">Skills: </label>
    <input type="text" id="skills" name="skills" value="${trainer.skills}" required><br>

    <label for="expertise">Expertise:   </label>
    <input type="text" id="expertise" name="expertise" value="${trainer.expertise}" required><br>

    <label for="duration">Duration: </label>
    <input type="number" id="duration" name="duration" value="${trainer.duration}" required><br>

    <input type="hidden" name="gym" value="${gymId}"><br>
    <br><br>
    <button type="submit">ADD TRAINER</button>

</form>
</body>
</html>--%>

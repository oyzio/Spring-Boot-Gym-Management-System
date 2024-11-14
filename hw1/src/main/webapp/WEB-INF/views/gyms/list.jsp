<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Gyms List</title>
</head>

<body>
<h1>List of Gyms</h1>

<ul>
    <c:forEach var="gym" items="${gyms}">
        <li>
            <h2>Gym Classes:</h2> ${gym.classes} <br>
            <h2>Website:</h2> <a href="${gym.website}" target="_blank">${gym.website}</a> <br>
            <a href="/trainers?gym=${gym.id}">View Trainers</a>
        </li>
    </c:forEach>
</ul>

<a href="/newGym">ADD A NEW GYM</a><br>

</body>
</html>

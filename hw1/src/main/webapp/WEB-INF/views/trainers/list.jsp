<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<h1>Trainers: </h1>

<ul>
    <c:forEach var="trainer" items="${trainers}">
        <li>
            <h2>${trainer.name}</h2>
            <h3>SKILLS: ${trainer.skills}</h3>
            <h3>EXPERTISE: ${trainer.expertise}</h3>
            <h3>DURATION: ${trainer.duration}</h3>
        </li>
    </c:forEach>
</ul>

<a href="/newTrainer?gym=${gym}">ADD A  NEW TRAINER</a>
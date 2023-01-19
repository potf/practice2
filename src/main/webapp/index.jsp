<%@ page contentType="text/html; ISO-8859-1" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<body>

</body>
<h2>Hello World!</h2>
<form method="post" action="StudentAdd">
    <table>
        <tbody>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input id="name" type="text" name="name"></td>
        </tr>
        <tr>
            <td><label for="surname">Surname</label></td>
            <td><input id="surname" type="text" name="surname"></td>
        </tr>
        <tr>
            <td><label for="age">Age</label></td>
            <td><input id="age" type="text" name="age"></td>
        </tr>
        <tr>
            <td><label for="email">Email</label></td>
            <td><input id="email" type="text" name="email"></td>
        </tr>
        <tr>
            <td><label for="group">Group</label></td>
            <td><input id="group" type="text" name="group"></td>
        </tr>
        <tr>
            <td><label for="faculty">Faculty</label></td>
            <td><input id="faculty" type="text" name="faculty"></td>
        </tr>
        </tbody>
    </table>
    <input type="submit" name="send" value="send">
</form>

<c:if test="${students.size} > 5">
    <form action="calculateStats">
        <input type="submit" name="send2" value="Statistics">
    </form>
</c:if>

<c: if test="${students.size()} > 0">
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Age</th>
            <th>Email</th>
            <th>Group</th>
            <th>Faculty</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td><c:out value="${student.getName()}"/></td>
                <td><c:out value="${student.getSurname}"/></td>
                <td><c:out value="${student.getAge()}"/></td>
                <td><c:out value="${student.getEmail()}"/></td>
                <td><c:out value="${student.getGroup()}"/></td>
                <td><c:out value="${student.getFaculty()}"/></td>
            </tr>
        </c:forEach>
    </table>

</c:>
</html>
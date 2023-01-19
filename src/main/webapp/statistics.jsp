<%@ page contentType="text/html; ISO-8859-1" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<table>
    <tbody>
    <tr>
        <td><label for="name">Mane Age:</label></td>
        <td>${stat.getMeanAge}</td>
    </tr>
    <tr>
        <td><label for="surname">Popular mail domain</label></td>
        <td>${stat.getPopularMailDomain}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
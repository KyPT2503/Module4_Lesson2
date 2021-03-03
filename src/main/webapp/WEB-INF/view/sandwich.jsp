<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/sandwich/save" method="post">
    <label>lettuce
        <input type="checkbox" value="lettuce" name="condiment">
    </label><br>
    <label>tomato
        <input type="checkbox" value="tomato" name="condiment">
    </label><br>
    <label>mustard
        <input type="checkbox" value="mustard" name="condiment">
    </label><br>
    <label>sprouts
        <input type="checkbox" value="sprouts" name="condiment">
    </label><br>
    <input type="submit" value="POST">
</form>
<h1>You have choose:</h1>
<c:forEach items="${condiment}" var="cond">
    <h3>${cond}</h3>
</c:forEach>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/email" method="post">
    <label>Email:
        <input type="text" name="email" value="">
    </label>
    <input type="submit" value="Confirm">
</form>
<h1>${message}</h1>
</body>
</html>

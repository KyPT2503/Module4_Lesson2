<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calculate" method="post">
    <input type="number" name="number1">
    <input type="number" name="number2">
    <select name="operation" id="operation">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <button type="submit">Calculate</button>
</form>
<c:if test="${result!=null}">
    <h1>${result}</h1>
</c:if>
</body>
</html>

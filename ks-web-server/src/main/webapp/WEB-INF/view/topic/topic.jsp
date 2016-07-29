<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 2016/7/28
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/include/taglib.jsp"%>
<html>
<head>
    <title>Topic</title>
</head>
<body>
    <c:forEach items="${topics}" var="item">
        ${item.name}<br>
    </c:forEach>
<br>
</body>
</html>

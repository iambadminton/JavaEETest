<%@ page import="somePackage.Cart" %><%--
  Created by IntelliJ IDEA.
  User: a.shipulin
  Date: 27.09.18
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<% Cart cart=(Cart)session.getAttribute("cart"); %>
<p>Наименование: <%= cart.getName()%></p>
<p>Количество: <%= cart.getQuantity() %></p>
</body>
</html>

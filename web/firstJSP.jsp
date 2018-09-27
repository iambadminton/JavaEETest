<%--
  Created by IntelliJ IDEA.
  User: a.shipulin
  Date: 27.09.18
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>

<p>



    <% String name = request.getParameter("name");
    %>

    <%= name %>


</p>
</body>
</html>

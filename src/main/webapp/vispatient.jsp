<%@ page import="data.Forbindelse" %>
<%@ page import="data.Patient" %><%--
  Created by IntelliJ IDEA.
  User: Jasmin
  Date: 06-11-2019
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%  String cpr = request.getParameter("cpr");
    Forbindelse f = new Forbindelse();
    Patient patient = f.searchUser(cpr);

    out.println(patient);

%>


    </body>
</html>

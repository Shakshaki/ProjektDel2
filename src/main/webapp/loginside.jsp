<%@ page import="data.Patient" %><%--

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Patient bruger = (Patient) session.getAttribute("bruger");
    if (bruger == null){
        response.sendRedirect("index.jsp");
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div> Velkokmmen </div>

</body>
</html>

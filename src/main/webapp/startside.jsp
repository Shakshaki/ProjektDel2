<%--
  Created by IntelliJ IDEA.
  User: JeffreyPrince
  Date: 30/10/2019
  Time: 15.03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%
   Patient bruger = (Patient) session.getAttribute("bruger");
   if (bruger == null){
       response.sendRedirect("index.jsp");
   }

%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Startside</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <div class="wrapper">
            <div class="item2">
                <div class="Header">

                    <p align="right"> Velkommen, navn </p>
                    <!-- Byder brugeren velkommen (justeret i højre side af vinduet) -->

                    <p align="right"> <button id = "logind"> Log ud </button> </p>
                    <!-- Log ud knap (justeret i højre side af vinduet) -->

                    <h1><img src="https://s3-eu-west-1.amazonaws.com/uploads.playbaamboozle.com/uploads/images/4895/1542358401_71269?fbclid=IwAR1W1_R56LPT4j5RSXYWg8Hk5&#45;&#45;0W1zgjjwONPnrBNUzpsGvRU2iuYUU-74"
                             width="120" height="120" alt="Sundhed" align="top">
                        Patientkalenderen
                    </h1>

                    <h3>Din personlige hospitals guide</h3>

                    <hr color="black" size="2.5">
                </div>
                <button id = "bestiltid"> Bestil ny tid </button>
                <h2>
                <div style="text-align: center;">Dato: Tid: Aftaletype:</div>
                </h2>

                <div style="text-align: center;">
                    25.09.2019 14:00 Konsultation <!-- indsæt værdier fra databasen-->
                    <button id = "ændrtid"> Ændr tid </button>
                </div>

                <!-- <h3><% out.println( new Date()); %></h3> -->

                <div class="item4">

                </div>
            </div>
        </div>
    </body>
</html>

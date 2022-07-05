<%@ page import="java.util.ArrayList" %>
<%@ page import="Classi.Argomento" %>
<%@ page import="Classi.Card" %><%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<% Argomento argomentoClass = (Argomento) request.getSession().getAttribute("argomentoClass");
ArrayList<Card> lista = argomentoClass.getListaCard();
%>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <title>letsLearn</title>
    <link rel="stylesheet" href="./bootstrap-4.5.3-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
</head>
<body class="text-center">
<div class="pageContenent">
    <div class="contenitoreTitoloSezione"><i class="far fa-star"></i><span class="titoloSezione">ARGOMENTO</span></div>
    <div class="card-columns">
        <% for (int i=0; i<lista.size();i++){%>
        <div class="card col-md-4">
            <div class="card-body"><img />
                <div class="card-footer"><i class="far fa-star"></i><span><%=lista.get(i).getText()%></span></div>
            </div>
        </div>
        <%}%>
    </div>
</div>
</body>
</html>

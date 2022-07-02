<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%ArrayList<String> arg = (ArrayList<String>) request.getSession().getAttribute("argomenti");
    String materia = (String) request.getSession().getAttribute("materia");
%> <%= arg%>
<html>
<head>
    <title><%=materia%></title>
    <link rel="stylesheet" href="./bootstrap-4.5.3-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
</head>
<body class="text-center">
<div class="pageContenent">
    <div class="contenitoreTitoloSezione"><i class="far fa-star"></i><span class="titoloSezione"><%=materia%></span></div>
    <ul class="list-unstyled">
        <li></li>
        <li class="rigaListaArgomento"><a class="btn bottoneArgomento" href="#">Link</a><i class="far fa-star"></i></li>
        <li class="rigaListaArgomento"><a class="btn bottoneArgomento" href="#">Link</a><i class="far fa-star iconaEsercizioArgomento"></i></li>

    </ul>
</div>


</body>
</html>

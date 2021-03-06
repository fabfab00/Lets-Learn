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
String materia = argomentoClass.getNome();
%>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
    <title>letsLearn</title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>
    <script src ="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>

</head>
<body class="text-center">
<img src="${pageContext.request.contextPath}/Immagini/C_ArgomentoSpecifico.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

<%@include file="/WEB-INF/Header/Header.jsp"%>
<div class="pageContenent">
    <div class="contenitoreTitoloSezione"><i onclick="riproduciAudio('<%=argomentoClass.getNome()%>',this)"> <%@include file="/Immagini/Sound.svg"%></i><span class="titoloSezione"><%=argomentoClass.getNome()%></span></div>
    <div class="card-columns">
        <% for (int i=0; i<lista.size();i++){%>
        <div class="card col-md-2">
            <div class="card-body"><img src="<%=lista.get(i).getPathImage()%>">
                <div class="card-footer"><i onclick="riproduciAudio('<%=lista.get(i).getText()%>',this)"> <%@include file="/Immagini/Sound.svg"%></i><span><%=lista.get(i).getText()%></span></div>
            </div>
        </div>
        <%}%>
    </div>
</div>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

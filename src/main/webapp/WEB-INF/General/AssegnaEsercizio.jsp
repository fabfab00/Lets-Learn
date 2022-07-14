<%@ page import="Classi.AssociaLeFrasiTraDiloro" %>
<%@ page import="Classi.AssociaImmagineConParola" %>
<%@ page import="Classi.ScriviLaparolaCorretta" %><%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%
String materia = (String) request.getAttribute("argomento");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AssegnaEsercizio</title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<body>

<%
    AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getAttribute("associaLeFrasiTraDiloro");
    AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getAttribute("associaImmagineConParola");
    ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getAttribute("scriviLaparolaCorretta");
    request.getSession().setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro);
    request.getSession().setAttribute("associaImmagineConParola", associaImmagineConParola);
    request.getSession().setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta);

%>

<%@include file="/WEB-INF/Header/Header.jsp"%>
<div class="pageContenent">

    <div class="contenitoreTitoloSezione"><span class="titoloSezione">Scegli Esercizi</span></div>
    <label class="form-label checkMarkContainer" style="text-align: left;vertical-align: middle;">Associa Immagine Con Parola
        <input type="checkbox" />
        <span class="checkmark"></span>
    </label>
    <label class="form-label checkMarkContainer" style="text-align: left;vertical-align: middle;">Associa Le Frasi Tra Di Loro
        <input type="checkbox" />
        <span class="checkmark"></span>
    </label>
    <label class="form-label checkMarkContainer" style="text-align: left;vertical-align: middle;">Scrivi La Parola Corretta
        <input type="checkbox" />
        <span class="checkmark"></span>
    </label>
    <form action="${pageContext.request.contextPath}/ServletAvviaPrimoEsercizio" method="get">
    <button class="btn btn-primary btn-continua" type="submit">Inizia</button>
    </form>
</div>
<script>
    function checkboxes(){
        var inputElems = document.getElementsByTagName("input"),
            count = 0;
        for (var i=0; i<inputElems.length; i++) {
            if (inputElems[i].type === "checkbox" && inputElems[i].checked === true){
                count++;
                alert(count);
            }
        }}
</script>
</body>
</html>

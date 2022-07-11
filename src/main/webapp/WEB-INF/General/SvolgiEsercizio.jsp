<%@ page import="Classi.AssociaLeFrasiTraDiloro" %>
<%@ page import="Classi.AssociaImmagineConParola" %>
<%@ page import="Classi.ScriviLaparolaCorretta" %><%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SvolgiEsercizio</title>
        <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
        <link rel="stylesheet" href="./customcss/general.css"/>
    </head>
    <%
    AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getAttribute("associaLeFrasiTraDiloro");
    AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getAttribute("associaImmagineConParola");
    ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getAttribute("scriviLaparolaCorretta");
    associaLeFrasiTraDiloro.getList1().get(0);
    %>
    <body>
    <%@include file="/WEB-INF/Header/Header.jsp"%>
        <div class="pageContenent">
            <div class="contenitoreTitoloSezione">
                <i onclick="">
                    <%@include file="/Immagini/Sound.svg"%>
                </i>
                <span class="titoloSezione">Argomento</span>
            </div>
            <!--Includere gli esercizi-->
            <%//@include file="/WEB-INF/Partials/EsercizioAssociaImmagineConParola.jsp"%>

            <%@include file="/WEB-INF/Partials/EsercizioAssociaLeFrasiTraDiLoro.jsp"%>

            <form action="${pageContext.request.contextPath}/ServletAvviaPrimoEsercizio" method="get">
                <button class="btn btn-primary btn-continua" type="submit">Inizia</button>
            </form>
        </div>
    </body>
</html>

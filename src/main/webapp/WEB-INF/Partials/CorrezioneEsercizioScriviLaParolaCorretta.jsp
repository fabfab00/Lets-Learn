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
    <title>Correzione Scrivi la parola </title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<%
    ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getSession().getAttribute("scriviLaparolaCorretta");
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

    <%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
    <div><img style="width: 552px;height: 302px;margin-bottom: 78px;" src="<%=scriviLaparolaCorretta.getImage()%>" />
        <form style="align-content: center;">
            <div style="width: 40%;align-self: center;position: relative;left: 30%;font-size: 40px;"><label class="form-label">Che cos'<span>&#232</span>?</label><input class="form-control text-center" id="parola" type="text" style="font-size: 40px;" value="<%=scriviLaparolaCorretta.getWord()%>" /></div>
        </form>
    </div>

        <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>
</div>

<script>
    function next(){
        window.location.replace("./ServletCorrezione");
    }
</script>

</body>
</html>

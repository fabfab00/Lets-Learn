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
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<%
    AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getAttribute("associaLeFrasiTraDiloro");
    AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getAttribute("associaImmagineConParola");
    ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getAttribute("scriviLaparolaCorretta");
%>

<%
    String partOne="Esercizio ";
    String partTwo;
    int number= (int) request.getSession().getAttribute("counter");
    if(number==1)
    {
        partTwo="1";
    }
    else if (number==2)
    {
        partTwo="2";
    }
    else if(number==3)
    {
        partTwo="3";
    }
    else
    {
        partTwo=" ";
    }
    String materia=partOne+partTwo;
%>

<body>
<img src="${pageContext.request.contextPath}/Immagini/C_ScriviLaParolaCorretta.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

<%@include file="/WEB-INF/Header/Header.jsp"%>
<hidden id="HeaderOscurato"></hidden>
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
            <div style="width: 40%;align-self: center;position: relative;left: 30%;font-size: 40px;"><label class="form-label">Che cos'<span>&#232</span>?</label><input class="form-control text-center" id="parola" type="text" style="font-size: 40px;" /></div>
        </form>
    </div>

        <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>
</div>

<script>
    function next(){
        var risposta=document.getElementById("parola").value
        window.location.replace("./ServletAvviaPrimoEsercizio?EsercizioUno=ciao&EsercizioDue=ciao&EsercizioTre=ciao&Tipologia=ScriviLaparolaCorretta&Risposta="+risposta);
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

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

<%
    /*String risposta= (String) request.getParameter("Risposta");
    System.out.println("Risposta Utente:"+ risposta);*/
    String rispUtente = scriviLaparolaCorretta.getRispostaUtente();
    String partOne="Correzione ";
    String partTwo;
    int number= (int) request.getSession().getAttribute("counterBis");
    if(number==1)
    {
        partTwo="1/";
    }
    else if (number==2)
    {
        partTwo="2/";
    }
    else if(number==3)
    {
        partTwo="3/";
    }
    else
    {
        partTwo="3/";
    }

    String partThree;
    int total=0;
    total= (int) request.getSession().getAttribute("total");
    if(total==1)
    {
        partThree="1";
    }
    else if (total==2)
    {
        partThree="2";
    }
    else
    {
        partThree="3";
    }
    String materia=partOne+partTwo+partThree;
%>

<body>
<img src="${pageContext.request.contextPath}/Immagini/C_CorreggiScriviLaParolaCorretta.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

<%@include file="/WEB-INF/Header/Header.jsp"%>
<div class="pageContenent">
    <div class="contenitoreTitoloSezione">
        <i onclick="riproduciAudio('Scrivi La Parola Corretta',this)"> <%@include file="/Immagini/Sound.svg"%></i>
        <span class="titoloSezione">Scrivi La Parola Corretta</span>
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
        <%if(rispUtente.equalsIgnoreCase(scriviLaparolaCorretta.getWord())){%>
        <form style="align-content: center;">
            <div style="width: 40%;align-self: center;position: relative;left: 30%;font-size: 40px;"><label class="form-label" >Che cos'<span>&#232</span>?</label><label class="form-control text-center"  style="font-size: 40px; color: green"/><%=scriviLaparolaCorretta.getWord()%></div>
        </form>
        <%}else if(!rispUtente.equalsIgnoreCase(scriviLaparolaCorretta.getWord())){%>
        <form style="align-content: center;">
            <div style=" width: 40%;align-self: center;position: relative;left: 30%;font-size: 40px;"><label class="form-label">Che cos'<span>&#232</span>?</label><label class="form-control text-center"  style="font-size: 40px; color: red"/><%=scriviLaparolaCorretta.getWord()%></div>
        </form>
        <%}%>
    </div>


</div><br>
<button class="btn btn-primary btn-continua" type="submit" onclick="next()" style="left: 40%;">Continua</button>

<script>
    function next(){
        window.location.replace("./ServletCorrezione");
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

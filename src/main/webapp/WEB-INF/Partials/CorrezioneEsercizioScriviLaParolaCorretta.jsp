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
    System.out.println("Risposta Utente:"+ rispUtente);
    String partOne="Correzione ";
    String partTwo;
    int number= (int) request.getSession().getAttribute("counterBis");
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
    System.out.println(materia);
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

        <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>
</div>

<script>
    function next(){
        window.location.replace("./ServletCorrezione");
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

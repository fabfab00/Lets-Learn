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
<img src="${pageContext.request.contextPath}/Immagini/C_AssociaImmagineConParola.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

<%@include file="/WEB-INF/Header/Header.jsp"%>
<hidden id="HeaderOscurato"></hidden>
<div class="pageContenent">
    <div class="contenitoreTitoloSezione">
        <i onclick="">
            <%@include file="/Immagini/Sound.svg"%>
        </i>
        <span class="titoloSezione">Argomento</span>
    </div>

    <%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <div class="immaginiRispostaMultipla">
        <img class="float-start" src="<%=associaImmagineConParola.getImage()%>" /><!--Singolo questionario-->
        <h4>Associa Immagine Con Parola</h4>
        <form>
            <ul class="list-group lista-domande">
                <li class="list-group-item"><!--Inizio singola domanda-->
                    <input class="invisible-checkbox" type="radio" name="random" id="one" />
                    <div></div>
                    <span><%=associaImmagineConParola.getWord().get(0)%></span>

                </li><!--Fine singola domanda-->
                <li class="list-group-item"><input class="invisible-checkbox" type="radio" name="random" id="two" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
                </li>
                <li class="list-group-item"><input class="invisible-checkbox" type="radio" name="random" id="three" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
                </li>
                <li class="list-group-item"><input class="invisible-checkbox" type="radio" name="random" id="four" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
                </li>
            </ul>
        </form>
    </div>

        <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>

</div>

<script>
    function next(){
        
        var risposta;
        if (document.getElementById("one").checked===true){
            risposta="<%=associaImmagineConParola.getWord().get(0)%>"
        }
        if (document.getElementById("two").checked===true){
            risposta="<%=associaImmagineConParola.getWord().get(1)%>"
        }
        if (document.getElementById("three").checked===true){
            risposta="<%=associaImmagineConParola.getWord().get(2)%>"
        }
        if (document.getElementById("four").checked===true){
            risposta="<%=associaImmagineConParola.getWord().get(3)%>"
        }

        window.location.replace("./ServletAvviaPrimoEsercizio?EsercizioUno=ciao&EsercizioDue=ciao&EsercizioTre=ciao&Tipologia=AssociaImmagineConParola&Risposta="+risposta);
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

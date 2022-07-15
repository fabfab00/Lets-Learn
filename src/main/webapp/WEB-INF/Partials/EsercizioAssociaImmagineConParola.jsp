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



<body>
<%@include file="/WEB-INF/Header/Header.jsp"%>
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
                    <input class="invisible-checkbox" type="checkbox" />
                    <div></div>
                    <span><%=associaImmagineConParola.getWord().get(0)%></span>

                </li><!--Fine singola domanda-->
                <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
                </li>
                <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
                </li>
                <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                    <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
                </li>
            </ul>
        </form>
    </div>

        <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>

</div>

<script>
    function next(){
        
        window.location.replace("./ServletAvviaPrimoEsercizio?EsercizioUno=ciao&EsercizioDue=ciao&EsercizioTre=ciao");
    }
</script>
</body>
</html>

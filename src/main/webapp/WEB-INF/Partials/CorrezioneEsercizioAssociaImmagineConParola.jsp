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
    <title>Correzione Associa Immagine con parola </title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<%
    AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getSession().getAttribute("associaImmagineConParola");
    int corr = associaImmagineConParola.getCorretta();

    int utente = associaImmagineConParola.getRispostaUtente();
%>

<%
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
<img src="${pageContext.request.contextPath}/Immagini/C_CorreggiAssociaImmagineConParola.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">
<%@include file="/WEB-INF/Header/Header.jsp"%>
<div class="pageContenent">
    <div class="contenitoreTitoloSezione">
        <i onclick="riproduciAudio('<%=materia%>',this)"> <%@include file="/Immagini/Sound.svg"%></i>
        <span class="titoloSezione">Associa Immagine Con Parola</span>
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
                    <%if(corr==0){%>
                    <input class="invisible-checkbox correct" type="checkbox"  checked />
                    <div></div>
                    <span><%=associaImmagineConParola.getWord().get(0)%></span>
                    <%}else if(utente==0){%>
                    <input class="invisible-checkbox"/>
                    <div></div>
                    <span><%=associaImmagineConParola.getWord().get(0)%></span>
                    <%}else{%>
                    <input class="invisible-checkbox"/>
                    <div></div>
                    <span><%=associaImmagineConParola.getWord().get(0)%></span>
                    <%}%>

                </li><!--Fine singola domanda-->
                <%if(corr==1){%>
                <li class="list-group-item"><input class="invisible-checkbox correct" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
                </li>
                <%}if(utente==1){%>
                <li class="list-group-item"><input class="invisible-checkbox wrong" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
                </li>
                <%}else {%>
                <li class="list-group-item"><input class="invisible-checkbox"  />
                    <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
                </li>
                <%}%>

                <%if(corr==2){%>
                <li class="list-group-item"><input class="invisible-checkbox correct" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
                </li>
                <%}if(utente==2){%>
                <li class="list-group-item"><input class="invisible-checkbox wrong" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
                </li>
                <%}else {%>
                <li class="list-group-item"><input class="invisible-checkbox"  />
                    <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
                </li>
                <%}%>

                <%if(corr==3){%>
                <li class="list-group-item"><input class="invisible-checkbox correct" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
                </li>
                <%}if(utente==3){%>
                <li class="list-group-item"><input class="invisible-checkbox wrong" type="checkbox"  checked />
                    <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
                </li>
                <%}else {%>
                <li class="list-group-item"><input class="invisible-checkbox"  />
                    <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
                </li>
                <%}%>
            </ul>
        </form>
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

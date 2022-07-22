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
    <script src ="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>


</head>
<body>
<img src="${pageContext.request.contextPath}/Immagini/C_AssegnaEsercizi.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

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
        <input type="checkbox" name="input" id="one" />
        <span class="checkmark"></span>
    </label>
    <label class="form-label checkMarkContainer" style="text-align: left;vertical-align: middle;">Associa Le Frasi Tra Di Loro
        <input type="checkbox" name="input" id="two" />
        <span class="checkmark"></span>
    </label>
    <label class="form-label checkMarkContainer" style="text-align: left;vertical-align: middle;">Scrivi La Parola Corretta
        <input type="checkbox" name="input" id="three"/>
        <span class="checkmark"></span>
    </label>
    <button class="btn btn-primary btn-continua" type="submit" onclick="check()">Inizia</button>

</div>

<script>
    function check(){
        var x=new Array(3);
            if (document.getElementById("one").checked===true){
                //count++;
                x[0]=true;
            }else{
                x[0]=false;
            }

        if (document.getElementById("two").checked===true){
            //count++;
            x[1]=true;
        }else{
            x[1]=false;
        }

        if (document.getElementById("three").checked===true){
            //count++;
            x[2]=true;
        }else{
            x[2]=false;
        }

        window.location.replace("./ServletAvviaPrimoEsercizio?EsercizioUno="+x[0]+"&EsercizioDue="+x[1]+"&EsercizioTre="+x[2]);
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

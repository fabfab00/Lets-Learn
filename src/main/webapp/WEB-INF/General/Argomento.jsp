<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%ArrayList<String> arg = (ArrayList<String>) request.getSession().getAttribute("argomenti");
    String materia = (String) request.getSession().getAttribute("materia");
%>
<html>

<script>
    var MATERIA;
    var ARGOMENTO;
    var nomeUtente="Mario88"
    var pwUtente="Password"
</script>


<head>
    <title><%=materia%></title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>
    <script src ="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
</head>
<body class="text-center">
<%@include file="/WEB-INF/Header/Header.jsp"%>

<div class="pageContenent" style="position: relative; z-index: 1">
    <img src="${pageContext.request.contextPath}/Immagini/C_Argomenti.png" id="img" style="display: none; position: absolute; z-index: 3; opacity: 0.6">
    <div class="contenitoreTitoloSezione"><i onclick="riproduciAudio('<%=materia%>')"> <%@include file="/Immagini/Sound.svg"%></i><span class="titoloSezione"><%=materia%></span></div>
    <ul class="list-unstyled">
        <li></li>
        <% for(int i = 0; i<arg.size();i++){%>
        <li class="rigaListaArgomento"><a class="btn bottoneArgomento" href="#" id="<%=i%>" onclick="teoria('<%=materia%>','<%=arg.get(i)%>')" ><%=arg.get(i)%></a><i onclick="esercizi('<%=materia%>','<%=arg.get(i)%>')"> <%@include file="/Immagini/Notepad.svg"%></i></li>
        <%}%>

    </ul>
</div>
<div id="overlay" style="display: none;justify-content: center;">
    <div class="loginContainer">
        <i id="xyz" onclick="close()" class="closeIcon" style="cursor: pointer;" >
            <%@include file="/Immagini/Cross.svg"%>
        </i>
        <div class="loginFormContainer" style="margin-top: 43px;">
            <form>
                <div class="row" style="margin: 65px -12px 0px;">
                    <div class="col"><span class="loginGuide">Inserisci <br />Nome Utente<br /></span></div>
                    <div class="col"><input id="nome" class="form-control" type="text" placeholder="Nome" style="margin-top: 4px;" /></div>
                </div>
                <div class="row" style="margin-bottom: 73px;margin-top: 48px;">
                    <div class="col"><span class="loginGuide">Inserisci <br />Password<br /></span></div>
                    <div class="col"><input id="pw" class="form-control" type="password" placeholder="Password" style="margin-top: 4px;" /></div>
                </div><button onclick="continua(document.getElementById('nome').value, document.getElementById('pw').value)" class="btn btn-primary" type="button" style="margin-top: 2%;margin-bottom: 10px;background: #99c7d9;">Continua</button>
            </form>
        </div>
    </div>
</div>

<script>

    function teoria(materia,argomento){

        window.location.replace("./ServletTeoria?materia="+materia+"&argomento="+argomento);
        console.log("materia: "+materia)
        console.log("argomento: "+argomento )
    }

    function esercizi(materia, argomento){
        document.getElementById("overlay").style.display="flex"
        MATERIA=materia;
        ARGOMENTO=argomento;
    }

    var buttonX=document.getElementById("xyz");

    buttonX.onclick=function () {
        close();
    }

    function close(){
        document.getElementById("overlay").style.display="none"
    }

    function continua(nome, password){
        if(nome===nomeUtente && password===pwUtente) {
            console.log(nome)
            console.log(password)
            window.location.replace("./ServletEsercizi?materia="+MATERIA+"&argomento="+ARGOMENTO);
        }else{
            alert("Nome utente o password errati")
        }
    }

    function OpenCoachmark()
    {
        document.getElementById("img").style.display="flex"
        document.getElementById("Open-Coachmark").style.display="none"
        document.getElementById("Close-Coachmark").style.display="flex"
    }

    function CloseCoachmark()
    {
        document.getElementById("img").style.display="none"
        document.getElementById("Open-Coachmark").style.display="flex"
        document.getElementById("Close-Coachmark").style.display="none"
    }

</script>

<%@include file="/WEB-INF/Footer/Footer.jsp"%>


</body>
</html>
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

<head>
    <title><%=materia%></title>
    <link rel="stylesheet" href="./bootstrap-4.5.3-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
</head>
<body class="text-center">
<div class="pageContenent">
    <div class="contenitoreTitoloSezione"><i onclick="ciao()"> <%@include file="/Immagini/Sound.svg"%></i><span class="titoloSezione"><%=materia%></span></div>
    <ul class="list-unstyled">
        <li></li>
        <% for(int i = 0; i<arg.size();i++){%>
        <li class="rigaListaArgomento"><a class="btn bottoneArgomento" href="#" id="<%=i%>" onclick="teoria('<%=materia%>','<%=arg.get(i)%>')" ><%=arg.get(i)%></a><i onclick="esercizi()"> <%@include file="/Immagini/Notepad.svg"%></i></li>
        <%}%>

    </ul>
</div>
<div id="overlay" style="display: none;justify-content: center;" >
    <div class="loginContainer"><i class="closeIcon"><%@include file="/Immagini/Cross.svg"%></i>
        <div class="loginFormContainer" style="margin-top: 43px;">
            <form>
                <div class="row" style="margin: 65px -12px 0px;">
                    <div class="col"><span class="loginGuide">Inserisci <br />Nome Utente<br /></span></div>
                    <div class="col"><input class="form-control" type="text" placeholder="Nome" style="margin-top: 4px;" /></div>
                </div>
                <div class="row" style="margin-bottom: 73px;margin-top: 48px;">
                    <div class="col"><span class="loginGuide">Inserisci <br />Password<br /></span></div>
                    <div class="col"><input class="form-control" type="text" placeholder="Password" style="margin-top: 4px;" /></div>
                </div><button class="btn btn-primary" type="button" style="margin-top: 2%;margin-bottom: 10px;background: #99c7d9;">Continua</button>
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

    function esercizi(){
        document.getElementById("overlay").style.display="flex"
        console.log("ciao")
    }
</script>



</body>
</html>

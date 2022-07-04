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

<script>
    function teoria(materia,argomento){

        window.location.replace("./ServletTeoria?materia="+materia+"&argomento="+argomento);
        console.log("materia: "+materia)
        console.log("argomento: "+argomento )
    }
    function esercizi(){
        console.log("ciao")
    }
</script>
</body>
</html>

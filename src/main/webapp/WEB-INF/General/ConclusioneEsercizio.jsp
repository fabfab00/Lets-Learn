<%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConclusioneEsercizio</title>
    <link rel="stylesheet" href="../../bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="../../customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<body class="text-center">
    <div class="pageContenent">
        <div class="contenitoreTitoloSezione" style="text-align: center">
            <span class="titoloSezione">Esercizio Concluso</span>
        </div>
        <div>
            <form style="align-content: center;" method="get" action="${pageContext.request.contextPath}/ServletCorrezione">
                <i style="display:inline-flex;width: 552px;height: 302px;margin-bottom: 78px;"><%@include file="/Immagini/CallTeacher.svg"%></i>
                <div>
                    <button class="btn btn-primary btn-continua" type="submit">Correggi</button>

                </div>
            </form>
        </div>
    </div>
</body>
</html>

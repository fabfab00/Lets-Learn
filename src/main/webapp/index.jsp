<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>BENVENUTO IN LET'S LEARN</title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <style>
        .bottoneHomeScreen {
            border: none;
            color: white;
            padding: 32px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 25px;
            margin: 4px 2px;
            transition-duration: 0.4s;
            cursor: pointer;
        }
        .bottoneHomeScreen {
            background-color: white;
            color: black;
            border: 2px solid #FCB66C;
        }

        .bottoneHomeScreen:hover {
            background-color: #FCB66C;
            border-color: #FCB66C;
            color: white;
        }

        /*prova prova prova*/
        .table td {
            border-top: white;
        }

    </style>
</head>
<body class="text-center">
<div class="table-responsive pageContenent">
    <table class="table" id="contenutoIndex">
        <thead>
            <tr></tr>
        </thead>
        <tbody style="--bs-body-font-size: 1;">
            <form action="${pageContext.request.contextPath}/ServletScegliMateria" method="get">
                <tr>
                    <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Italiano" value="Italiano">Italiano</button></td>
                    <td></td>
                    <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Matematica" value="Matematica">Matematica</button></td>
                </tr>
                <tr>
                    <td><button  class="btn btn-primary bottoneHomeScreen" name="materia" id="Storia" value="Storia">Storia</button></td>

                    <td><img src="./Immagini/Home.png" width="400px" height="250px"></td>

                    <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Arte" value="Arte">Arte</button></td>
                </tr>
                <tr>
                    <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Geografia" value="Geografia">Geografia</button></td>
                    <td></td>
                    <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Scienze" value="Scienze">Scienze</button></td>

                </tr>
            </form>
        </tbody>
    </table>
</div>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>
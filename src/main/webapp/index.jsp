<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>BENVENUTO IN LET'S LEARN</title>
    <link rel="stylesheet" href="./bootstrap-4.5.3-dist/css/bootstrap.css"/>
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
    <table class="table">
        <thead>
        <tr></tr>
        </thead>
        <tbody style="--bs-body-font-size: 1;">
        <form action="${pageContext.request.contextPath}/ServletScegliMateria" method="get">
            <tr>
                <td align="center"><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Grammatica" value="Grammatica">Grammatica</button></td>
                <td></td>
                <td align="center"><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Matematica" value="Matematica">Matematica</button></td>
            </tr>
            <tr>
                <td align="center"></td>
                <td align="center"><img src="./Immagini/Home.png" width="400px" height="250px"></td>
                <td align="center"></td>
            </tr>
            <tr>
                <td align="center"><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Geostoria" value="Geostoria">Geostoria</button></td>
                <td align="center"></td>
                <td align="center"><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Scienze" value="Scienze">Scienze</button></td>
            </tr>
        </form>
        </tbody>
    </table>
</div>
</body>
</html>
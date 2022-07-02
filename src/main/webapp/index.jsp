<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>BENVENUTO IN LET'S LEARN</title>
    <link rel="stylesheet" href="./bootstrap-4.5.3-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
</head>
<body>
<div class="table-responsive">
    <table class="table">
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
            <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Scienze" value="Scienze">Scienze</button></td>
            <td><img /></td>
            <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Geografia" value="Geografia">Geografia</button></td>
        </tr>
        <tr>
            <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Storia" value="Storia">Storia</button></td>
            <td></td>
            <td><button class="btn btn-primary bottoneHomeScreen" name="materia" id="Educazionecivica" value="Educazionecivica">Educazione Civica</button></td>
        </tr>
        </form>
        </tbody>
    </table>
</div>
</body>
</html>
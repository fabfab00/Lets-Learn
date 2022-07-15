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
    <!--Includere gli esercizi-->

    <%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
    <canvas id="canvas" height="100%" width="100%" style="position: absolute;left: 0;top: 0;width: 100%;height: 100%;"></canvas>
    <div class="pageContenent">
        <div class="contenitoreTitoloSezione"><span class="titoloSezione">Scegli Esercizi</span></div>
        <form>
            <div><img style="width: 552px;height: 302px;margin-bottom: 78px;" src="<%=associaLeFrasiTraDiloro.getImage()%>"/>
                <ul class="list-unstyled">
                    <li>
                        <div class="float-start" style="width: 50%;">
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input id="1" class="invisible-checkbox" type="checkbox" />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(0)%></span>
                            </div>
                        </div>
                        <div class="float-start" style="width: 50%;">
                            <div class="colonna-frasi colonna-destra" onclick="select(this)"><input id="2" class="invisible-checkbox" type="checkbox" onclick="select(this)" />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(0)%></span>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="float-start" style="width: 50%;">
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input id="3" class="invisible-checkbox" type="checkbox" />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(1)%></span>
                            </div>
                        </div>
                        <div class="float-start" style="width: 50%;">
                            <div class="colonna-frasi colonna-destra" onclick="select(this)"><input id="4" class="invisible-checkbox" type="checkbox" onclick="select(this)" />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(1)%></span>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </form>
    </div>

     <button class="btn btn-primary btn-continua" type="submit" onclick="next()">Continua</button>
</div>

<script>
    function next(){

        var risposta1;
        var risposta2;

        if (document.getElementById("1").checked===true){
            risposta1="<%=associaLeFrasiTraDiloro.getList1().get(0)%>"
        }
        if (document.getElementById("2").checked===true){
            risposta1="<%=associaLeFrasiTraDiloro.getList2().get(0)%>"
        }
        if (document.getElementById("3").checked===true){
            risposta2="<%=associaLeFrasiTraDiloro.getList1().get(1)%>"
        }
        if (document.getElementById("4").checked===true){
            risposta2="<%=associaLeFrasiTraDiloro.getList2().get(1)%>"
        }

        window.location.replace("./ServletAvviaPrimoEsercizio?EsercizioUno=ciao&EsercizioDue=ciao&EsercizioTre=ciao&Tipologia=AssociaLeFrasiTraDiLoro&Risposta="+risposta1+"&RispostaBis="+risposta2);
    }
</script>

</body>
</html>

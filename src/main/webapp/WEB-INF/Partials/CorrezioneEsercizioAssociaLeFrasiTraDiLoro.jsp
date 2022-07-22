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
    <title>Correzione Associa Le Frasi </title>
    <link rel="stylesheet" href="./bootstrap-5.0.2-dist/css/bootstrap.css"/>
    <link rel="stylesheet" href="./customcss/general.css"/>
    <script src="./Javascript/HeaderClick.js"></script>

</head>
<%
    AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getSession().getAttribute("associaLeFrasiTraDiloro");
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
<img src="${pageContext.request.contextPath}/Immagini/C_CorreggiAssociaLeFrasiTraDiLoro.png" id="img" style="top: 0; left: 0; width: 100vw; height: 100vh; position: absolute; z-index: 3; opacity: 0.6; display: none">

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
        <%System.out.println("Risposta List 1: "+associaLeFrasiTraDiloro.getRispostaUtente1());
            System.out.println("Risposta List 2: "+associaLeFrasiTraDiloro.getRispostaUtente2());%>
        <form>
            <div><img style="width: 552px;height: 302px;margin-bottom: 78px;" src="<%=associaLeFrasiTraDiloro.getImage()%>"/>
                <ul class="list-unstyled">
                    <li>
                        <div class="float-start" style="width: 50%;">
                            <%if(associaLeFrasiTraDiloro.getCorrettaList1()==0){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox correct" type="checkbox" checked/>
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(0)%></span>
                            </div>
                            <%}else if(associaLeFrasiTraDiloro.getRispostaUtente1()==0) {%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input class="invisible-checkbox wrong" type="checkbox" checked />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(0)%></span>
                            </div>
                            <%}else{%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input class="invisible-checkbox" />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(0)%></span>
                            </div>
                            <%}%>
                        </div>
                        <div class="float-start" style="width: 50%;">
                            <%if(associaLeFrasiTraDiloro.getCorrettaList2()==0){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox correct" type="checkbox" checked/>
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(0)%></span>
                            </div>
                            <%}else if(associaLeFrasiTraDiloro.getRispostaUtente2()==0){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input class="invisible-checkbox wrong" type="checkbox" checked />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(0)%></span>
                            </div>
                            <%}else{%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input class="invisible-checkbox"  />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(0)%></span>
                            </div>
                            <%}%>
                        </div>
                    </li>
                    <li>
                        <div class="float-start" style="width: 50%;">
                            <%if(associaLeFrasiTraDiloro.getCorrettaList1()==1){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox correct" type="checkbox" checked/>
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(1)%></span>
                            </div>
                            <%}else if(associaLeFrasiTraDiloro.getRispostaUtente1()==1){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox wrong" type="checkbox" checked  />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(1)%></span>
                            </div>
                            <%}else{%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox"  />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList1().get(1)%></span>
                            </div>
                            <%}%>
                        </div>
                        <div class="float-start" style="width: 50%;">
                            <%if(associaLeFrasiTraDiloro.getCorrettaList2()==1){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox correct" type="checkbox" checked/>
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(1)%></span>
                            </div>
                            <%}else if (associaLeFrasiTraDiloro.getRispostaUtente2()==1){%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox wrong" type="checkbox" checked  />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(1)%></span>
                            </div>
                            <%} else {%>
                            <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input  class="invisible-checkbox"  />
                                <div></div><span><%=associaLeFrasiTraDiloro.getList2().get(1)%></span>
                            </div>
                            <%}%>
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
        window.location.replace("./ServletCorrezione");
    }
</script>
<%@include file="/WEB-INF/Footer/Footer.jsp"%>

</body>
</html>

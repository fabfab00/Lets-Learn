<%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="immaginiRispostaMultipla">
    <img class="float-start" src="<%=associaImmagineConParola.getImage()%>" /><!--Singolo questionario-->
    <h4>Associa Immagine Con Parola</h4>
    <form>
        <ul class="list-group lista-domande">
            <li class="list-group-item"><!--Inizio singola domanda-->
                <input class="invisible-checkbox" type="checkbox" />
                <div></div>
                <span><%=associaImmagineConParola.getWord().get(0)%></span>

            </li><!--Fine singola domanda-->
            <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                <div></div><span><%=associaImmagineConParola.getWord().get(1)%></span>
            </li>
            <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                <div></div><span><%=associaImmagineConParola.getWord().get(2)%></span>
            </li>
            <li class="list-group-item"><input class="invisible-checkbox" type="checkbox" />
                <div></div><span><%=associaImmagineConParola.getWord().get(3)%></span>
            </li>
        </ul>
    </form>
</div>


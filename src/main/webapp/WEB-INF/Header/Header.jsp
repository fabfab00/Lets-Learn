<%--
  Created by IntelliJ IDEA.
  User: 129109
  Date: 01/07/2022
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<div id = "Overlay-Traduttore" class = "clickable-overlay" onclick="chiudiOverlay(this)" style = "display: none"></div>
<div id= "Overlay-Dizionario"class = "clickable-overlay" onclick="chiudiOverlay(this)"  style = "display: none" ></div>
<nav class="navbar navbar-light navbar-expand-md" style="height: 115px;background: #FCB66C;">
    <div class="container-fluid">
        <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navcol-1">
            <span class="visually-hidden">Toggle navigation</span>
            <span class="navbar-toggler-icon"></span>
        </button>
        <a href="index.jsp" id="Link-Home"><img height="90px" src="./Immagini/Home.png"/></a>
        <div id="navcol-1" class="collapse navbar-collapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link active intestazioneNavbar" href="#" style="font-size: 93px;padding: 0px;color: white;margin-left: 10px"><%=materia%></a></li>
            </ul>
        </div>
        <div id = "headerIconContainer">
            <div>
                <i class="ms-auto" style="font-size: 54px;text-align: right;" onclick="apriOverlay('Overlay-Dizionario')" ><%@include file="/Immagini/Dictionary.svg"%></i>
                    <div id="Box-Dizionario" class="contenitore-box text-center" style = "display: none">
                        <div class="input-overlay">
                            <div class="contenitore-icona-registrazione"><i onclick="registraAudio(this)" style="height: inherit;width: inherit;"><%@include file="/Immagini/Recorder.svg"%></i></div>
                            <input id ="Input-Dizionario" class="text-input" type="text" placeholder="Cerca" style="text-align: center;" />
                            <div class="contenitore-icona-cerca" onclick="cerca()"><img src="./Immagini/Magnifier.svg" /></div>
                        </div><div id="Contenitore-Risultato-Dizionario" class="risultato-vuoto"></div>
                    </div>

            </div>
            <div>
                <i class="ms-auto" style="font-size: 54px;" onclick="apriOverlay('Overlay-Traduttore')"><%@include file="/Immagini/Translate.svg"%></i>
                    <div id="Box-Traduttore" class="contenitore-box text-center" style = "display: none">

                        <div class="contenitore">
                            <form id="Traduttore1" class="traduttore" >
                                <select class="form-select selettore-lingua" name="lingua">
                                <optgroup label="Lingue">
                                    <option value="ita" selected>Italiano</option>
                                    <option value="en">English</option>
                                    <option value="spa">Spanish</option>
                                </optgroup>
                            </select>
                                <div class="contenitore-traduzione">
                                    <textarea class="form-control" onchange="traduci(this)" name="testo"></textarea>
                                    <div class="contenitore-icona-riproduzione">
                                        <i onclick="riproduciTraduzione(this)" style="height: inherit;width: inherit;"> <%@include file="/Immagini/Sound.svg"%></i></div>
                                    <div class="contenitore-icona-registrazione">
                                        <i onclick="registraAudio(this)" style="height: inherit;width: inherit;"><%@include file="/Immagini/Recorder.svg"%></i></div>
                                </div>
                            </form>
                            <form id="Traduttore2" class="traduttore">
                                <select class="form-select selettore-lingua" name="lingua">
                                <optgroup label="Lingue">
                                    <option value="ita">Italiano</option>
                                    <option value="en" selected>English</option>
                                    <option value="spa">Spanish</option>
                                </optgroup>
                            </select>
                                <div class="contenitore-traduzione">
                                    <textarea class="form-control" name="testo"></textarea>
                                    <div class="contenitore-icona-riproduzione">
                                        <i onclick="riproduciTraduzione(this)" style="height: inherit;width: inherit;"> <%@include file="/Immagini/Sound.svg"%></i></div>
                                    <div class="contenitore-icona-registrazione">
                                        <i onclick="registraAudio(this)" style="height: inherit;width: inherit;"><%@include file="/Immagini/Recorder.svg"%></i></div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

    </div>
</nav>
<audio id = "Riproduci-Audio" autoplay ="autoplay"></audio>


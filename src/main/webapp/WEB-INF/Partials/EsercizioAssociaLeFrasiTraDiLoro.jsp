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
    <div><img style="width: 552px;height: 302px;margin-bottom: 78px;" />
        <ul class="list-unstyled">
            <li>
                <div class="float-start" style="width: 50%;">
                    <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input id="1" class="invisible-checkbox" type="checkbox" />
                        <div></div><span>Text</span>
                    </div>
                </div>
                <div class="float-start" style="width: 50%;">
                    <div class="colonna-frasi colonna-destra" onclick="select(this)"><input id="2" class="invisible-checkbox" type="checkbox" onclick="select(this)" />
                        <div></div><span>Text</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="float-start" style="width: 50%;">
                    <div class="colonna-frasi colonna-sinistra" onclick="select(this)"><input id="3" class="invisible-checkbox" type="checkbox" />
                        <div></div><span>Text</span>
                    </div>
                </div>
                <div class="float-start" style="width: 50%;">
                    <div class="colonna-frasi colonna-destra" onclick="select(this)"><input id="4" class="invisible-checkbox" type="checkbox" onclick="select(this)" />
                        <div></div><span>Text</span>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>

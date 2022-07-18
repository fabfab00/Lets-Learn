window.onload=function() {
    if (document.getElementById("HeaderOscurato") != null) {
        let link = document.getElementById("Link-Home")
            link.style ="pointer-events: none;"
        link.firstChild.style = "filter: contrast(25%);"
    }
}
function chiudiOverlay(premuto){
    let id = premuto.id;
    console.log(id)
    let box
    if(id === "Overlay-Dizionario") {
        box = document.getElementById("Box-Dizionario")
    }else {
        box = document.getElementById("Box-Traduttore")
    }
    box.style.display = "none";
    premuto.style.display = "none";

}

function apriOverlay(cosa){
    let x
    if(cosa === "Overlay-Dizionario"){
         x = document.getElementById("Box-Dizionario")
    }else{
         x = document.getElementById("Box-Traduttore")
    }
    console.log(x)
    document.getElementById(cosa).style.display = "";
    x.style.display = "";
}

function cerca(){

    let x = document.getElementById("Input-Dizionario")
    if(x === "")
        return
    const xhttp = new XMLHttpRequest();
    let url = "./ServletDizionario?parola="+x.value
    xhttp.open("GET",url,true)
    xhttp.onload = function() {
        document.getElementById("Contenitore-Risultato-Dizionario").innerHTML=this.responseText
    }

    xhttp.send();
}
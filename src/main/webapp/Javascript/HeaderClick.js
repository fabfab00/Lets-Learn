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
    x.class = ""
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

function traduci(){
    let formData1 = new FormData(document.getElementById("Traduttore1"))
    let formData2 = new FormData(document.getElementById("Traduttore2"))

    let htmlDoc = escape(formData1.get("testo"))
    console.log(htmlDoc)
    const xhttp = new XMLHttpRequest();
    let url = "./ServletTraduttore?lingua1="+formData1.get("lingua")+"&lingua2="+formData2.get("lingua")+
        "&testo="+htmlDoc
    console.log(url)
    xhttp.open("GET",url,true)
    xhttp.onload = function() {
        formData2.set("testo",this.responseText);
    }

    xhttp.send();
}

function riproduciAudio(testo, oggetto){
    const xhttp = new XMLHttpRequest();
    let url = "http://api.voicerss.org/?key=93041108365e4f7fb0668e56cacb380d&hl=it-it&f=16khz_16bit_stereo&src="+testo
    let x =document.getElementById("Riproduci-Audio").src = url;
    let sound=oggetto.firstChild.nextSibling.childNodes[1]
    let play = oggetto.firstChild.nextSibling.childNodes[3]
    sound.classList.toggle("transparente")
    play.classList.toggle("transparente")
    setTimeout(function () {
        sound.classList.toggle("transparente")
        play.classList.toggle("transparente")
        },2000)
}

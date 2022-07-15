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
    let url = "https://www.treccani.it/enciclopedia/"
    let x = document.getElementById("Input-Dizionario")
    if(x === "")
        return
    const xhttp = new XMLHttpRequest();
    url = url + x.value +"/"
    xhttp.open("GET",url,true)
    xhttp.setRequestHeader("Host","www.treccani.it")
    xhttp.setRequestHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:102.0) Gecko/20100101 Firefox/102.0")
    xhttp.setRequestHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
    xhttp.setRequestHeader("Accept-Language","it,it-IT;q=0.8,en-US;q=0.5,en;q=0.3")
    xhttp.setRequestHeader("Accept-Encoding","gzip, deflate, br")
    xhttp.setRequestHeader("DNT","1")
    xhttp.setRequestHeader("Connection","keep-alive")
    xhttp.setRequestHeader("Cookie","Cookie_Treccani=rd8o00000000000000000000ffffc0a88264o80; JSESSIONID=1340034FCB63C14C48553109E1314D1A")
    xhttp.setRequestHeader("Upgrade-Insecure-Requests","1")
    xhttp.setRequestHeader("Sec-Fetch-Dest","document")
    xhttp.setRequestHeader("Sec-Fetch-Mode","navigate")
    xhttp.setRequestHeader("Sec-Fetch-Site","same-origin")
    xhttp.setRequestHeader("Sec-Fetch-User","?1")
    xhttp.setRequestHeader("Sec-GPC","1")

    xhttp.onload = function() {
        document.getElementById("Contenitore-Risultato-Dizionario").innerHTML=this.responseText.match('/(<div class="text spiega" style="text-align: justify;">\n' +
            '\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>\n' +
            '\t\t\t\t\t\t\t\t\t\n' +
            '\t\t\t\t\t\t\t\t\t<\\/p><p>)(.+?)(<\\/p>\n' +
            '<div class="thumb tright">)/s')

    }

    xhttp.send();
}
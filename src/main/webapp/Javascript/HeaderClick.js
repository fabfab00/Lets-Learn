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
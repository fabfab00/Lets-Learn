var lastClick = null;
var oggettoSinistro;
var oggettoDestro;
var canvas = document.getElementById("canvas");
var context ;
var risposte;
var body;
var oggetto;
var daEliminare;
var primoClick= true;
var flagClick = false;

function select(oggettoCliccato){
    body = document.getElementsByClassName("body");

    canvas.width = document.body.clientWidth; //document.width is obsolete
    canvas.height = document.body.clientHeight; //document.height is obsolete
    canvasW = canvas.width;
    canvasH = canvas.height;

    oggetto = oggettoCliccato.firstChild;


    if(oggetto.id % 2 == 1)
        oggettoSinistro = oggetto;
    else if(oggetto != null) oggettoDestro = oggetto;




    if(lastClick == null){
        lastClick = oggetto
        return
    }

    if(oggettoDestro != null && oggettoSinistro != null){
        saveAnswer()
        lastClick = null
    }
    eliminaUltimoClick();
    redrawCanvas();
    lastClick = oggetto;
}


function eliminaUltimoClick(){
    if(!oggetto.checked){
        risposte.forEach(eliminaSalvato)
        if(daEliminare != null){
            risposte.delete(daEliminare);
        }
        oggettoSinistro= null; oggettoDestro = null;
    }
    if(lastClick!= null && (risposte == null || risposte.get(lastClick) == null || !risposte.has(lastClick)) ){
        if(lastClick.id % 2 == oggetto.id %2 && lastClick != oggetto)
            lastClick.checked = false;
    }
}

function eliminaSalvato(sinistra,destra){
    if(sinistra.id == oggetto.id||destra.id==oggetto.id){
        sinistra.checked = false;
        destra.checked = false;
        daEliminare = destra;
    }
}



function saveAnswer(){
    if(risposte == null) risposte = new Map();
    else{
        risposte.forEach(eliminaClone);
        risposte.delete(daEliminare);
        daEliminare = null;
    }

    risposte.set(oggettoSinistro, oggettoDestro)
    oggettoDestro = null;
    oggettoSinistro =null;
    lastClick = null;
}


function eliminaClone(sinistra,destra){
    console.log(sinistra,destra)
    if(sinistra.id == oggetto.id||destra.id==oggetto.id){
        sinistra.checked = false;
        destra.checked = false;
        daEliminare = destra;
    }
}

function redrawCanvas(){
    context= canvas.getContext('2d');
    context.clearRect(0, 0, canvas.width, canvas.height);
    if(risposte != null)
        risposte.forEach(draw);
    return;
}

function draw(sinistra,destra){
    let  xOggettoSinistro=sinistra.getBoundingClientRect().x;
    let yOggettoSinistro=sinistra.getBoundingClientRect().y+sinistra.getBoundingClientRect().height/2;
    let xOggettoDestro=destra.getBoundingClientRect().x+destra.getBoundingClientRect().width
    let yOggettoDestro = destra.getBoundingClientRect().y+destra.getBoundingClientRect().height/2;

    context.strokeStyle = 'black';
    context.lineWidth = 5;
    context.beginPath();
    context.moveTo(xOggettoSinistro ,yOggettoSinistro);
    context.lineTo(xOggettoDestro ,yOggettoDestro);
    context.stroke();
}

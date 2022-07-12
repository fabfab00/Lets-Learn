package Classi;

import java.util.ArrayList;

public class DatabaseEsercizi {

    private ArrayList<EserciziPerArgomento> italiano=new ArrayList<>();
    private ArrayList<EserciziPerArgomento> matematica=new ArrayList<>();
    private ArrayList<EserciziPerArgomento> storia=new ArrayList<>();
    private ArrayList<EserciziPerArgomento> scienze=new ArrayList<>();
    private ArrayList<EserciziPerArgomento> geografia=new ArrayList<>();
    private ArrayList<EserciziPerArgomento> arte=new ArrayList<>();

    public DatabaseEsercizi(){
        creaEserciziArte();
        creaEserciziGeografia();
        creaEserciziItaliano();
        creaEserciziMatematica();
        creaEserciziScienze();
        creaEserciziStoria();
    }

    public void creaEserciziItaliano(){

        ArrayList<AssociaImmagineConParola> alfabetoAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> pList = new ArrayList<>();
        pList.add("M");
        pList.add("A");
        pList.add("P");
        pList.add("F");
        alfabetoAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Italiano/Alfabeto/p.png", pList,2));
        ArrayList<ScriviLaparolaCorretta> alfabetoScriviLaparolaCorretta = new ArrayList<>();
        alfabetoScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Italiano/Alfabeto/s.png","S"));
        ArrayList<AssociaLeFrasiTraDiloro> alfabetoAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> gList1 = new ArrayList<>();
        gList1.add("La persona e': ");
        gList1.add("La lettera e': ");
        ArrayList<String> gList2 = new ArrayList<>();
        gList2.add(" V");
        gList2.add(" G");
        alfabetoAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Italiano/Alfabeto/g.png", gList1, gList2, 1, 1));
        italiano.add(new EserciziPerArgomento("Alfabeto", alfabetoAssociaImmagineConParola, alfabetoAssociaLeFrasiTraDiloro, alfabetoScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> alimentiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> tortaList = new ArrayList<>();
        tortaList.add("Torta");
        tortaList.add("Caffe'");
        tortaList.add("Pasta");
        tortaList.add("Caramelle");
        alimentiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Italiano/Alimenti/torta.png", tortaList, 0));
        ArrayList<ScriviLaparolaCorretta> alimentiScriviLaparolaCorretta = new ArrayList<>();
        alimentiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Italiano/Alimenti/pollo.png", "Pollo"));
        ArrayList<AssociaLeFrasiTraDiloro> alimentiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> mieleList1 = new ArrayList<>();
        mieleList1.add("L'alimento e': ");
        mieleList1.add("La pianta e': ");
        ArrayList<String> mieleList2 = new ArrayList<>();
        mieleList2.add(" miele");
        mieleList2.add(" burro");
        alimentiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Italiano/Alimenti/miele.png", mieleList1, mieleList2, 0, 0));
        italiano.add(new EserciziPerArgomento("Alimenti", alimentiAssociaImmagineConParola, alimentiAssociaLeFrasiTraDiloro, alimentiScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> personeAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> programmatoreList = new ArrayList<>();
        programmatoreList.add("Attore");
        programmatoreList.add("Casalinga");
        programmatoreList.add("Militare");
        programmatoreList.add("Programmatore");
        personeAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Italiano/PersoneMestieri/programmatore.png", programmatoreList, 3));
        ArrayList<ScriviLaparolaCorretta> personeScriviLaparolaCorretta = new ArrayList<>();
        personeScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Italiano/PersoneMestieri/cuoco.png", "Cuoco"));
        ArrayList<AssociaLeFrasiTraDiloro> personeAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> pompiereList1 = new ArrayList<>();
        pompiereList1.add("Il mestiere e': ");
        pompiereList1.add("Il numero e': ");
        ArrayList<String> pompiereList2 = new ArrayList<>();
        pompiereList2.add(" commesso");
        pompiereList2.add(" pompiere");
        alimentiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Italiano/PersoneMestieri/pompiere.png", pompiereList1, pompiereList2, 0, 1));
        italiano.add(new EserciziPerArgomento("Persone e Mestieri", personeAssociaImmagineConParola, personeAssociaLeFrasiTraDiloro, personeScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> verbiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> rilassarsiList = new ArrayList<>();
        rilassarsiList.add("Mangiare");
        rilassarsiList.add("Rilassarsi");
        rilassarsiList.add("Guidare");
        rilassarsiList.add("Spostare");
        verbiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Italiano/Verbi/rilassarsi.png", rilassarsiList, 1));
        ArrayList<ScriviLaparolaCorretta> verbiScriviLaparolaCorretta = new ArrayList<>();
        verbiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Italiano/Verbi/ballare.png", "Ballare"));
        ArrayList<AssociaLeFrasiTraDiloro> verbiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> abbracciareList1 = new ArrayList<>();
        abbracciareList1.add("Il tempo e': ");
        abbracciareList1.add("Il verbo e': ");
        ArrayList<String> abbracciareList2 = new ArrayList<>();
        abbracciareList2.add(" abbracciare");
        abbracciareList2.add(" pregare");
        verbiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Italiano/Verbi/abbracciare.png", abbracciareList1, abbracciareList2, 1, 0));
        italiano.add(new EserciziPerArgomento("Verbi", verbiAssociaImmagineConParola, verbiAssociaLeFrasiTraDiloro, verbiScriviLaparolaCorretta));
    }

    public void creaEserciziMatematica(){}

    public void creaEserciziScienze(){}

    public void creaEserciziStoria(){
        ArrayList<AssociaImmagineConParola> civiltaAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> inglesiList = new ArrayList<>();
        inglesiList.add("Africani");
        inglesiList.add("Cinesi");
        inglesiList.add("Inglesi");
        inglesiList.add("Giapponesi");
        civiltaAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Storia/Civilta/inglesi.png",inglesiList,2));
        ArrayList<AssociaLeFrasiTraDiloro> civiltaAssociaLeFrasiTraDiloro =new ArrayList<>();
        ArrayList<String> coreaniList1 = new ArrayList<>();
        coreaniList1.add("Questi sono");
        coreaniList1.add("Gli oggetti sono");
        ArrayList<String> coreaniList2 = new ArrayList<>();
        coreaniList2.add("coreani");
        coreaniList2.add("africani");
        civiltaAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Storia/Civilta/coreani.png",coreaniList1,coreaniList2,0,0));
        ArrayList<ScriviLaparolaCorretta> civiltaScriviLaParolaCorretta = new ArrayList<>();
        civiltaScriviLaParolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Storia/Civilta/spagnoli.png","Spagnoli"));
        storia.add(new EserciziPerArgomento("Civiltà",civiltaAssociaImmagineConParola,civiltaAssociaLeFrasiTraDiloro,civiltaScriviLaParolaCorretta));

        ArrayList<AssociaImmagineConParola> divinitaAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> eraList = new ArrayList<>();
        eraList.add("Era");
        eraList.add("Apollo");
        eraList.add("Zeus");
        eraList.add("Poseidone");
        divinitaAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Storia/DivinitaGreche/era.png",eraList,0));
        ArrayList<AssociaLeFrasiTraDiloro> divinitaAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> atenaList1 = new ArrayList<>();
        atenaList1.add("La divinità è: ");
        atenaList1.add("La civiltà è: ");
        ArrayList<String> atenaList2 = new ArrayList<>();
        atenaList2.add("Dionioso");
        atenaList2.add("Atena");
        divinitaAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Storia/DivinitaGreche/atena.png",atenaList1,atenaList2,0,1));
        ArrayList<ScriviLaparolaCorretta> divinitaScriviLaparolaCorretta = new ArrayList<>();
        divinitaScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Storia/DivinitaGreche/poseidone.png","Poseidone"));
        storia.add(new EserciziPerArgomento("Divinità Greche",divinitaAssociaImmagineConParola,divinitaAssociaLeFrasiTraDiloro,divinitaScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> orarioAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> dueList = new ArrayList<>();
        dueList.add("Tre/Quindici");
        dueList.add("Due/Quattordici");
        dueList.add("Cinque/Diciassette");
        dueList.add("Undici/Ventitrè");
        orarioAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Storia/Orario/due.png",dueList,1));
        ArrayList<AssociaLeFrasiTraDiloro> orarioAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> treList1 = new ArrayList<>();
        treList1.add("La divinità è: ");
        treList1.add("L'orario e': ");
        ArrayList<String> treList2 = new ArrayList<>();
        treList2.add("Tre/Quindici");
        treList2.add("Sette/Diciannove");
        orarioAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Storia/Orario/tre.png",treList1,treList2,1,0));
        ArrayList<ScriviLaparolaCorretta> orarioScriviLaparolaCorretta = new ArrayList<>();
        orarioScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Storia/Orario/otto.png","Otto/Venti"));
        storia.add(new EserciziPerArgomento("Orario",orarioAssociaImmagineConParola,orarioAssociaLeFrasiTraDiloro,orarioScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> tempoAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> invernoList = new ArrayList<>();
        dueList.add("Autunno");
        dueList.add("Estate");
        dueList.add("Primavera");
        dueList.add("Inverno");
        tempoAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Storia/Tempo/inverno.png",invernoList,3));
        ArrayList<AssociaLeFrasiTraDiloro> tempoAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> pomeriggioList1 = new ArrayList<>();
        treList1.add("La civiltà è");
        treList1.add("Il tempo è");
        ArrayList<String> pomeriggioList2 = new ArrayList<>();
        treList2.add("notte");
        treList2.add("pomeriggio");
        tempoAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Storia/Tempo/pomeriggio.png",pomeriggioList1,pomeriggioList2,1,1));
        ArrayList<ScriviLaparolaCorretta> tempoScriviLaparolaCorretta = new ArrayList<>();
        tempoScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Storia/Tempo/mattina.png","Mattina"));
        storia.add(new EserciziPerArgomento("Tempo",tempoAssociaImmagineConParola,tempoAssociaLeFrasiTraDiloro,tempoScriviLaparolaCorretta));











    }

    public void creaEserciziGeografia(){

        ArrayList<AssociaImmagineConParola> luoghiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> centrocommercialeList = new ArrayList<>();
        centrocommercialeList.add("Centro Commerciale");
        centrocommercialeList.add("Chiesa");
        centrocommercialeList.add("Pizzeria");
        centrocommercialeList.add("Bar");
        luoghiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Geografia/LuoghiCittadini/centrocommerciale.png", centrocommercialeList, 0));
        ArrayList<ScriviLaparolaCorretta> luoghiScriviLaparolaCorretta = new ArrayList<>();
        luoghiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Geografia/LuoghiCittadini/pizzeria.png", "Pizzeria"));
        ArrayList<AssociaLeFrasiTraDiloro> luoghiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> ospedaleList1 = new ArrayList<>();
        ospedaleList1.add("l'alimento e': ");
        ospedaleList1.add("Il luogo e': ");
        ArrayList<String> ospedaleList2 = new ArrayList<>();
        ospedaleList2.add(" panetteria");
        ospedaleList2.add(" ospedale");
        luoghiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Geografia/LuoghiCittadini/ospedale.png", ospedaleList1, ospedaleList2, 1, 1));
        geografia.add(new EserciziPerArgomento("Luoghi Cittadini", luoghiAssociaImmagineConParola, luoghiAssociaLeFrasiTraDiloro, luoghiScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> paesaggiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> vulcanoList = new ArrayList<>();
        vulcanoList.add("Montagna");
        vulcanoList.add("Scogli");
        vulcanoList.add("Lago");
        vulcanoList.add("Vulcano");
        paesaggiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Geografia/Paesaggi/vulcano.png", vulcanoList, 3));
        ArrayList<ScriviLaparolaCorretta> paesaggiScriviLaparolaCorretta = new ArrayList<>();
        paesaggiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta(("./ImmaginiCard/Geografia/Paesaggi/cascata.png"), "Cascata"));
        ArrayList<AssociaLeFrasiTraDiloro> paesaggiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> collinaList1 = new ArrayList<>();
        collinaList1.add("Il paesaggio è: ");
        collinaList1.add("Il simbolo è: ");
        ArrayList<String> collinaList2 = new ArrayList<>();
        collinaList2.add(" pianura");
        collinaList2.add(" collina");
        paesaggiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Geografia/Pesaggi/collina.png", collinaList1, collinaList2, 0, 1));
        geografia.add(new EserciziPerArgomento("Paesaggi", paesaggiAssociaImmagineConParola, paesaggiAssociaLeFrasiTraDiloro, paesaggiScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> pianetiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> gioveList = new ArrayList<>();
        gioveList.add("Nettuno");
        gioveList.add("Venere");
        gioveList.add("Giove");
        gioveList.add("Terra");
        pianetiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Geografia/Pianeti/giove.png", gioveList, 2));
        ArrayList<ScriviLaparolaCorretta> pianetiScriviLaparolaCorretta = new ArrayList<>();
        pianetiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta(("./ImmaginiCard/Geografia/Pianeti/saturno.png"), "Saturno"));
        ArrayList<AssociaLeFrasiTraDiloro> pianetiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> marteList1 = new ArrayList<>();
        marteList1.add("Il verbo è: ");
        marteList1.add("Il pianeta è: ");
        ArrayList<String> marteList2 = new ArrayList<>();
        marteList2.add(" Marte");
        marteList2.add(" Urano");
        pianetiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Geografia/Paesaggi/marte.png", marteList1, marteList2, 1, 0));
        geografia.add(new EserciziPerArgomento("Pianeti", pianetiAssociaImmagineConParola, pianetiAssociaLeFrasiTraDiloro, pianetiScriviLaparolaCorretta));

        ArrayList<AssociaImmagineConParola> posizioniAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> alCentroList = new ArrayList<>();
        alCentroList.add("Dietro");
        alCentroList.add("alCentro");
        alCentroList.add("Sotto");
        alCentroList.add(("Davanti"));
        posizioniAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Geografia/Posizioni/alCentro.png", alCentroList, 1));
        ArrayList<ScriviLaparolaCorretta> posizioniScriviLaparolaCorretta = new ArrayList<>();
        posizioniScriviLaparolaCorretta.add(new ScriviLaparolaCorretta(("./ImmaginiCard/Geografia/Posizioni/sopra.png"), "Sopra"));
        ArrayList<AssociaLeFrasiTraDiloro> posizioniAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> davantiList1 = new ArrayList<>();
        davantiList1.add("La posizione è: ");
        davantiList1.add("La civiltà è: ");
        ArrayList<String> davantiList2 = new ArrayList<>();
        davantiList2.add(" davanti");
        davantiList2.add(" vicino");
        posizioniAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Geografia/Posizioni/davanti.png", davantiList1, davantiList2, 0, 0));
        geografia.add((new EserciziPerArgomento("Posizioni", posizioniAssociaImmagineConParola,posizioniAssociaLeFrasiTraDiloro,posizioniScriviLaparolaCorretta)));
    }

    public void creaEserciziArte(){

        ArrayList<AssociaImmagineConParola> coloriAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> arancionelist = new ArrayList<>();
        arancionelist.add("Blu");
        arancionelist.add("Bianco");
        arancionelist.add("Verde");
        arancionelist.add("Arancione");
        coloriAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Arte/Colori/arancione.png",arancionelist,3 ));
        ArrayList<ScriviLaparolaCorretta> coloriScriviLaParolaCorretta = new ArrayList<>();
        coloriScriviLaParolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Arte/Colori/azzurro.png","Azzurro"));
        ArrayList<AssociaLeFrasiTraDiloro> coloriAssociaLeFrasiTraDiLoro = new ArrayList<>();
        ArrayList<String> verdeList1 = new ArrayList<>();
        verdeList1.add("Il colore e': ");
        verdeList1.add("Il rumore e': ");
        ArrayList<String> verdeList2 = new ArrayList<>();
        verdeList2.add(" verde chiaro");
        verdeList1.add(" blu ");
        coloriAssociaLeFrasiTraDiLoro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Arte/Colori/verdeChiaro.png",verdeList1,verdeList2,0,0));
        arte.add(new EserciziPerArgomento("Colori",coloriAssociaImmagineConParola,coloriAssociaLeFrasiTraDiLoro,coloriScriviLaParolaCorretta));

        ArrayList<AssociaImmagineConParola> matScolasticoAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> pennaList = new ArrayList<>();
        pennaList.add("Astuccio");
        pennaList.add("Penna");
        pennaList.add("Matita");
        pennaList.add("Righello");
        matScolasticoAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Arte/MaterialeScolastico/penna.png",pennaList,1));
        ArrayList<AssociaLeFrasiTraDiloro> matScolasticoAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> gessoList1 = new ArrayList<>();
        gessoList1.add("Il colore è: ");
        gessoList1.add("Il materiale scolastico è: ");
        ArrayList<String> gessoList2 = new ArrayList<>();
        gessoList2.add("gesso");
        gessoList2.add("temperino");
        matScolasticoAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Arte/MaterialeScolastico/gesso.png",gessoList1,gessoList2,1,0));
        ArrayList<ScriviLaparolaCorretta> matScolasticoScriviLaparolaCorretta = new ArrayList<>();
        matScolasticoScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Arte/MaterialeScolastico/zaino.png","Zaino"));
        arte.add(new EserciziPerArgomento("Materiale Scolastico",matScolasticoAssociaImmagineConParola,matScolasticoAssociaLeFrasiTraDiloro,matScolasticoScriviLaparolaCorretta));


        ArrayList<AssociaImmagineConParola> musicaAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> armonicaList = new ArrayList<>();
        armonicaList.add("Armonica");
        armonicaList.add("Sassofono");
        armonicaList.add("Violino");
        armonicaList.add("Chitarra elettrica");
        musicaAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Arte/Musica/armonica.png",armonicaList,0));
        ArrayList<AssociaLeFrasiTraDiloro> musicaAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> pianoforteList1 = new ArrayList<>();
        pianoforteList1.add("Lo strumento è");
        pianoforteList1.add("Il materiale scolastico è ");
        ArrayList<String> pianoforteList2 = new ArrayList<>();
        pianoforteList2.add("Flauto");
        pianoforteList2.add("Pianoforte");
        musicaAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Arte/Musica/pianoforte.png",pianoforteList1,pianoforteList2,0,1));
        ArrayList<ScriviLaparolaCorretta> musicaScriviLaParolaCorretta = new ArrayList<>();
        musicaScriviLaParolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Arte/Musica/arpa.png","Arpa"));
        arte.add(new EserciziPerArgomento("Musica",musicaAssociaImmagineConParola,musicaAssociaLeFrasiTraDiloro,musicaScriviLaParolaCorretta));

        ArrayList<AssociaImmagineConParola> vestitiAssociaImmagineConParola = new ArrayList<>();
        ArrayList<String> felpaList = new ArrayList<>();
        felpaList.add("Abito");
        felpaList.add("Cappotto");
        felpaList.add("Felpa");
        felpaList.add("Jeans");
        vestitiAssociaImmagineConParola.add(new AssociaImmagineConParola("./ImmaginiCard/Arte/Vestiti/felpa.png",felpaList,2));
        ArrayList<AssociaLeFrasiTraDiloro> vestitiAssociaLeFrasiTraDiloro = new ArrayList<>();
        ArrayList<String> gonnaList1 = new ArrayList<>();
        ArrayList<String> gonnaList2 = new ArrayList<>();
        gonnaList1.add("Il colore è");
        gonnaList1.add("il vestito è");
        gonnaList2.add("maglione");
        gonnaList2.add("gonna");
        vestitiAssociaLeFrasiTraDiloro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Arte/Vestiti/gonna.png",gonnaList1,gonnaList2,1,1));
        ArrayList<ScriviLaparolaCorretta> vestitiScriviLaparolaCorretta = new ArrayList<>();
        vestitiScriviLaparolaCorretta.add(new ScriviLaparolaCorretta("./ImmaginiCard/Arte/Vestiti/pantaloni.png","Pantaloni"));
        arte.add(new EserciziPerArgomento("Vestiti",vestitiAssociaImmagineConParola,vestitiAssociaLeFrasiTraDiloro,vestitiScriviLaparolaCorretta));


    }

    public ArrayList<EserciziPerArgomento> getItaliano() {
        return italiano;
    }

    public ArrayList<EserciziPerArgomento> getMatematica() {
        return matematica;
    }

    public ArrayList<EserciziPerArgomento> getStoria() {
        return storia;
    }

    public ArrayList<EserciziPerArgomento> getScienze() {
        return scienze;
    }

    public ArrayList<EserciziPerArgomento> getGeografia() {
        return geografia;
    }

    public ArrayList<EserciziPerArgomento> getArte() {
        return arte;
    }

    public EserciziPerArgomento getEserciziPerArgomentobyNome(String nome, ArrayList<EserciziPerArgomento> list){
        for (EserciziPerArgomento e: list) {
            if(e.getNomeArgomento().equalsIgnoreCase(nome)){
                return e;
            }
        }
        return null;
    }
}

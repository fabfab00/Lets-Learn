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

    public void creaEserciziItaliano(){}

    public void creaEserciziMatematica(){}

    public void creaEserciziScienze(){}

    public void creaEserciziStoria(){}

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
        verdeList2.add(" blu ");
        coloriAssociaLeFrasiTraDiLoro.add(new AssociaLeFrasiTraDiloro("./ImmaginiCard/Arte/Colori/verdeChiaro.png",verdeList1,verdeList2,1,1));
        arte.add(new EserciziPerArgomento("Colori",coloriAssociaImmagineConParola,coloriAssociaLeFrasiTraDiLoro,coloriScriviLaParolaCorretta));

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

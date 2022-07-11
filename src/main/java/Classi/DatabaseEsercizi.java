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

    public void creaEserciziGeografia(){}

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

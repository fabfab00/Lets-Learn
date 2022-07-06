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

    }

    public void creaEserciziMatematica(){

    }
    public void creaEserciziScienze(){

    }
    public void creaEserciziStoria(){

    }
    public void creaEserciziGeografia(){

    }
    public void creaEserciziArte(){

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

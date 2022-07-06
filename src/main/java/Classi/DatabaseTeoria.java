package Classi;

import java.util.ArrayList;

public class DatabaseTeoria {

    private ArrayList<Argomento> italiano=new ArrayList<>();
    private ArrayList<Argomento> geografia=new ArrayList<>();;
    private ArrayList<Argomento> storia=new ArrayList<>();;
    private ArrayList<Argomento> matematica=new ArrayList<>();;
    private ArrayList<Argomento> scienze=new ArrayList<>();;
    private ArrayList<Argomento> arte=new ArrayList<>();;

    public DatabaseTeoria() {
        creaItaliano();
        creaGeografia();
        creaArte();
        creaMatematica();
        creaScienze();
        creaStoria();



    }

    private void creaItaliano(){
        ArrayList<Card> ortografia = new ArrayList<>();
        ortografia.add(new Card("Prova1","../webapp/WEB-INF/Image/Prova1.jpg"));
        ortografia.add(new Card("Prova2","../webapp/WEB-INF/Image/Prova1.jpg"));
        ArrayList<Card> comunincazione = new ArrayList<>();
        comunincazione.add(new Card("Prova3","../webapp/WEB-INF/Image/Prova1.jpg"));
        comunincazione.add(new Card("Prova4","../webapp/WEB-INF/Image/Prova1.jpg"));
        italiano.add(new Argomento("Ortografia",ortografia));
        italiano.add(new Argomento("Comunicazione",comunincazione));
    }
    private void creaGeografia(){}

    private void creaStoria(){}

    private void creaMatematica(){}

    private void creaScienze(){}

    private void creaArte(){
        ArrayList<Card> colori = new ArrayList<>();
        colori.add(new Card("Arancione","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Azzurro","Image/Arte/Colori/azzurro.png"));
        colori.add(new Card("Bianco","Image/Arte/Colori/bianco.png"));
        colori.add(new Card("Blu","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Giallo","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Grigio","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Marrone","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Nero","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Rosa","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Rosso","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Verde Chiaro","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Verde Scuro","Image/Arte/Colori/arancione.png"));
        colori.add(new Card("Viola","Image/Arte/Colori/arancione.png"));

        ArrayList<Card> materialeScolastico = new ArrayList<>();
        materialeScolastico.add(new Card("Astuccio","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Calcolatrice","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Gesso","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Gomma","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Libro","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Matita","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Matite Colorate","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Penna","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Quaderni","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Righello","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Temperino","Image/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Zaino","Image/Arte/MaterialeScolastico/astuccio.png"));
        arte.add(new Argomento("Colori",colori));
        arte.add(new Argomento("Materiale Scolastico",materialeScolastico));



    }


    public ArrayList<Argomento> getItaliano() {
        return italiano;
    }

    public ArrayList<Argomento> getGeografia() {
        return geografia;
    }

    public ArrayList<Argomento> getStoria() {
        return storia;
    }

    public ArrayList<Argomento> getMatematica() {
        return matematica;
    }

    public ArrayList<Argomento> getScienze() {
        return scienze;
    }

    public ArrayList<Argomento> getArte() {
        return arte;
    }


    public Argomento getArgomentoByNome(ArrayList<Argomento> listaArgomentiPerMateria, String nome){

        for (Argomento a: listaArgomentiPerMateria) {
            if (a.getNome().equalsIgnoreCase(nome)){
                return a;
            }
        }
        return null;
    } //Marty tvb <3


}

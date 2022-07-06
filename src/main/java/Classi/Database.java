package Classi;

import java.util.ArrayList;

public class Database {

    private ArrayList<Argomento> grammatica=new ArrayList<>();
    private ArrayList<Argomento> geostoria;
    private ArrayList<Argomento> matematica;
    private ArrayList<Argomento> scienze;

    public Database() {
        creaGrammatica();

    }

    private void creaGrammatica(){
        ArrayList<Card> ortografia = new ArrayList<>();
        ortografia.add(new Card("Prova1", "Image/Prova1.jpg"));
        ortografia.add(new Card("Prova2", "Image/Prova1.jpg"));
        ArrayList<Card> comunincazione = new ArrayList<>();
        comunincazione.add(new Card("Prova3", "Image/Prova1.jpg"));
        comunincazione.add(new Card("Prova4", "Image/Prova1.jpg"));
        grammatica.add(new Argomento("Ortografia",ortografia));
        grammatica.add(new Argomento("Comunicazione",comunincazione));
    }

    public ArrayList<Argomento> getGrammatica() {
        return grammatica;
    }

    public ArrayList<Argomento> getGeostoria() {
        return geostoria;
    }

    public ArrayList<Argomento> getMatematica() {
        return matematica;
    }

    public ArrayList<Argomento> getScienze() {
        return scienze;
    }

    public Argomento getArgomentoByNome(ArrayList<Argomento> listaArgomentiPerMateria, String nome){

        for (Argomento a: listaArgomentiPerMateria) {
            if (a.getNome().equalsIgnoreCase(nome)){
                return a;
            }
        }
        return null;
    }
}

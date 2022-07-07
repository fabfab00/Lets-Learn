package Classi;

import java.util.ArrayList;

public class AssociaImmagineConParola {

    String image;
    ArrayList<String> word=new ArrayList<>();
    int corretta;
    int rispostaUtente;

    public AssociaImmagineConParola(String image, ArrayList<String> word, int corretta) {
        this.image = image;
        this.word = word;
        this.corretta = corretta;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<String> getWord() {
        return word;
    }

    public int getCorretta() {
        return corretta;
    }

    public int getRispostaUtente() {
        return rispostaUtente;
    }

    public void setRispostaUtente(int rispostaUtente) {
        this.rispostaUtente = rispostaUtente;
    }
}

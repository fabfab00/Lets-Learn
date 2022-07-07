package Classi;

public class ScriviLaparolaCorretta {

    String image;
    String word;
    String rispostaUtente;

    public ScriviLaparolaCorretta(String image, String word) {
        this.image = image;
        this.word = word;
    }

    public String getImage() {
        return image;
    }

    public String getWord() {
        return word;
    }

    public String getRispostaUtente() {
        return rispostaUtente;
    }

    public void setRispostaUtente(String rispostaUtente) {
        this.rispostaUtente = rispostaUtente;
    }
}

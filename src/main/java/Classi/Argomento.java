package Classi;

import java.util.ArrayList;

public class Argomento {
    private String nome;
    private ArrayList<Card> listaCard;

    public Argomento(String nome, ArrayList<Card> listaCard) {
        this.nome = nome;
        this.listaCard = listaCard;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Card> getListaCard() {
        return listaCard;
    }

    public void setListaCard(ArrayList<Card> listaCard) {
        this.listaCard = listaCard;
    }
}

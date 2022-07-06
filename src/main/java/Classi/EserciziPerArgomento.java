package Classi;

import java.util.ArrayList;

public class EserciziPerArgomento {
    private String nomeArgomento;
    private ArrayList<AssociaImmagineConParola> associaImmagineConParolaArrayList;
    private ArrayList<AssociaLeFrasiTraDiloro> associaLeFrasiTraDiloroArrayList;
    private ArrayList<ScriviLaparolaCorretta> scriviLaparolaCorrettaArrayList;

    public EserciziPerArgomento(String nomeArgomento, ArrayList<AssociaImmagineConParola> associaImmagineConParolaArrayList, ArrayList<AssociaLeFrasiTraDiloro> associaLeFrasiTraDiloroArrayList, ArrayList<ScriviLaparolaCorretta> scriviLaparolaCorrettaArrayList) {
        this.nomeArgomento = nomeArgomento;
        this.associaImmagineConParolaArrayList = associaImmagineConParolaArrayList;
        this.associaLeFrasiTraDiloroArrayList = associaLeFrasiTraDiloroArrayList;
        this.scriviLaparolaCorrettaArrayList = scriviLaparolaCorrettaArrayList;
    }

    public String getNomeArgomento() {
        return nomeArgomento;
    }

    public ArrayList<AssociaImmagineConParola> getAssociaImmagineConParolaArrayList() {
        return associaImmagineConParolaArrayList;
    }

    public ArrayList<AssociaLeFrasiTraDiloro> getAssociaLeFrasiTraDiloroArrayList() {
        return associaLeFrasiTraDiloroArrayList;
    }

    public ArrayList<ScriviLaparolaCorretta> getScriviLaparolaCorrettaArrayList() {
        return scriviLaparolaCorrettaArrayList;
    }
}

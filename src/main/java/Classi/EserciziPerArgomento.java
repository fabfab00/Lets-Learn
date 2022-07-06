package Classi;

import java.util.ArrayList;

public class EserciziPerArgomento {
    private String nomeArgomento;
    private ArrayList<AssociaImmagineConParola> EsercizioAssociaImmagineConParola;
    private ArrayList<AssociaLeFrasiTraDiloro> EsercizioAssociaLeFrasiTraDiLoro;
    private ArrayList<ScriviLaparolaCorretta> EsercizioScriviLaParolaCorretta;

    public EserciziPerArgomento(String nomeArgomento, ArrayList<AssociaImmagineConParola> esercizioAssociaImmagineConParola, ArrayList<AssociaLeFrasiTraDiloro> esercizioAssociaLeFrasiTraDiLoro, ArrayList<ScriviLaparolaCorretta> esercizioScriviLaParolaCorretta) {
        this.nomeArgomento = nomeArgomento;
        EsercizioAssociaImmagineConParola = esercizioAssociaImmagineConParola;
        EsercizioAssociaLeFrasiTraDiLoro = esercizioAssociaLeFrasiTraDiLoro;
        EsercizioScriviLaParolaCorretta = esercizioScriviLaParolaCorretta;
    }

    public String getNomeArgomento() {
        return nomeArgomento;
    }

    public ArrayList<AssociaImmagineConParola> getEsercizioAssociaImmagineConParola() {
        return EsercizioAssociaImmagineConParola;
    }

    public ArrayList<AssociaLeFrasiTraDiloro> getEsercizioAssociaLeFrasiTraDiLoro() {
        return EsercizioAssociaLeFrasiTraDiLoro;
    }

    public ArrayList<ScriviLaparolaCorretta> getEsercizioScriviLaParolaCorretta() {
        return EsercizioScriviLaParolaCorretta;
    }
}

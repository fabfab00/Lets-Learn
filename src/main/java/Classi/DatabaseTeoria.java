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

    private void creaItaliano(){}

    private void creaGeografia(){
        ArrayList<Card> luoghi = new ArrayList<>();
        luoghi.add(new Card("Aeroporto","./ImmaginiCard/Geografia/LuoghiCittadini/aereoporto.png"));
        luoghi.add(new Card("Albergo","./ImmaginiCard/Geografia/LuoghiCittadini/albergo.png"));
        luoghi.add(new Card("Banca","./ImmaginiCard/Geografia/LuoghiCittadini/banca.png"));
        luoghi.add(new Card("Bar","./ImmaginiCard/Geografia/LuoghiCittadini/bar.png"));
        luoghi.add(new Card("Biblioteca","./ImmaginiCard/Geografia/LuoghiCittadini/biblioteca.png"));
        luoghi.add(new Card("Centro commerciale","./ImmaginiCard/Geografia/LuoghiCittadini/centrocommerciale.png"));
        luoghi.add(new Card("Chiesa","./ImmaginiCard/Geografia/LuoghiCittadini/chiesa.png"));
        luoghi.add(new Card("Edicola","./ImmaginiCard/Geografia/LuoghiCittadini/edicola.png"));
        luoghi.add(new Card("Farmacia","./ImmaginiCard/Geografia/LuoghiCittadini/farmacia.png"));
        luoghi.add(new Card("Libreria","./ImmaginiCard/Geografia/LuoghiCittadini/libreria.png"));
        luoghi.add(new Card("Negozio frutta e verdura","./ImmaginiCard/Geografia/LuoghiCittadini/negozioFruttaVerdura.png"));
        luoghi.add(new Card("Ospedale","./ImmaginiCard/Geografia/LuoghiCittadini/ospedale.png"));
        luoghi.add(new Card("Panetteria","./ImmaginiCard/Geografia/LuoghiCittadini/panetteria.png"));
        luoghi.add(new Card("Pasticceria","./ImmaginiCard/Geografia/LuoghiCittadini/pasticceria.png"));
        luoghi.add(new Card("Pescheria","./ImmaginiCard/Geografia/LuoghiCittadini/pescheria.png"));
        luoghi.add(new Card("Pizzeria","./ImmaginiCard/Geografia/LuoghiCittadini/pizzeria.png"));
        luoghi.add(new Card("Ristorante","./ImmaginiCard/Geografia/LuoghiCittadini/ristorante.png"));
        luoghi.add(new Card("Scuola","./ImmaginiCard/Geografia/LuoghiCittadini/scuola.png"));
        luoghi.add(new Card("Supermercato","./ImmaginiCard/Geografia/LuoghiCittadini/supermercato.png"));

        ArrayList<Card> paesaggi = new ArrayList<>();
        paesaggi.add(new Card("Bosco","./ImmaginiCard/Geografia/Paesaggi/bosco.png"));
        paesaggi.add(new Card("Cascata","./ImmaginiCard/Geografia/Paesaggi/cascata.png"));
        paesaggi.add(new Card("Collina","./ImmaginiCard/Geografia/Paesaggi/collina.png"));
        paesaggi.add(new Card("Fiume","./ImmaginiCard/Geografia/Paesaggi/fiume.png"));
        paesaggi.add(new Card("Ghiacciaio","./ImmaginiCard/Geografia/Paesaggi/ghiacciaio.png"));
        paesaggi.add(new Card("Lago","./ImmaginiCard/Geografia/Paesaggi/lago.png"));
        paesaggi.add(new Card("Mare","./ImmaginiCard/Geografia/Paesaggi/mare.png"));
        paesaggi.add(new Card("Montagna","./ImmaginiCard/Geografia/Paesaggi/montagna.png"));
        paesaggi.add(new Card("Pianura","./ImmaginiCard/Geografia/Paesaggi/pianura.png"));
        paesaggi.add(new Card("Scogli","./ImmaginiCard/Geografia/Paesaggi/scogli.png"));
        paesaggi.add(new Card("Spiaggia","./ImmaginiCard/Geografia/Paesaggi/spiaggia.png"));
        paesaggi.add(new Card("Vulcano","./ImmaginiCard/Geografia/Paesaggi/vulcano.png"));

        ArrayList<Card> pianeti = new ArrayList<>();
        pianeti.add(new Card("Mercurio","./ImmaginiCard/Geografia/Pianeti/mercurio.png"));
        pianeti.add(new Card("Venere","./ImmaginiCard/Geografia/Pianeti/venere.png"));
        pianeti.add(new Card("Terra","./ImmaginiCard/Geografia/Pianeti/terra.png"));
        pianeti.add(new Card("Marte","./ImmaginiCard/Geografia/Pianeti/marte.png"));
        pianeti.add(new Card("Giove","./ImmaginiCard/Geografia/Pianeti/giove.png"));
        pianeti.add(new Card("Urano","./ImmaginiCard/Geografia/Pianeti/urano.png"));
        pianeti.add(new Card("Nettuno","./ImmaginiCard/Geografia/Pianeti/nettuno.png"));
        pianeti.add(new Card("Plutone","./ImmaginiCard/Geografia/Pianeti/plutone.png"));

        ArrayList<Card> posizioni = new ArrayList<>();
        posizioni.add(new Card("Al centro","./ImmaginiCard/Geografia/Posizioni/alCentro.png"));
        posizioni.add(new Card("Davanti","./ImmaginiCard/Geografia/Posizioni/davanti.png"));
        posizioni.add(new Card("Dentro","./ImmaginiCard/Geografia/Posizioni/dentro.png"));
        posizioni.add(new Card("Dietro","./ImmaginiCard/Geografia/Posizioni/dietro.png"));
        posizioni.add(new Card("Sopra","./ImmaginiCard/Geografia/Posizioni/sopra.png"));
        posizioni.add(new Card("Sotto","./ImmaginiCard/Geografia/Posizioni/sotto.png"));
        posizioni.add(new Card("Vicino","./ImmaginiCard/Geografia/Posizioni/vicino.png"));

        geografia.add(new Argomento("Posizioni",posizioni));
        geografia.add(new Argomento("Pianeti",pianeti));
        geografia.add(new Argomento("Paesaggi",paesaggi));
        geografia.add(new Argomento("Luoghi cittadini",luoghi));

    }

    private void creaStoria(){}

    private void creaMatematica(){}

    private void creaScienze(){}

    private void creaArte(){

        ArrayList<Card> colori = new ArrayList<>();
        colori.add(new Card("Arancione","./ImmaginiCard/Arte/Colori/arancione.png"));
        colori.add(new Card("Azzurro","./ImmaginiCard/Arte/Colori/azzurro.png"));
        colori.add(new Card("Bianco","./ImmaginiCard/Arte/Colori/bianco.png"));
        colori.add(new Card("Blu","./ImmaginiCard/Arte/Colori/blu.png"));
        colori.add(new Card("Giallo","./ImmaginiCard/Arte/Colori/giallo.png"));
        colori.add(new Card("Grigio","./ImmaginiCard/Arte/Colori/grigio.png"));
        colori.add(new Card("Marrone","./ImmaginiCard/Arte/Colori/marrone.png"));
        colori.add(new Card("Nero","./ImmaginiCard/Arte/Colori/nero.png"));
        colori.add(new Card("Rosa","./ImmaginiCard/Arte/Colori/rosa.png"));
        colori.add(new Card("Rosso","./ImmaginiCard/Arte/Colori/rosso.png"));
        colori.add(new Card("Verde Chiaro","./ImmaginiCard/Arte/Colori/verdeChiaro.png"));
        colori.add(new Card("Verde Scuro","./ImmaginiCard/Arte/Colori/verdeScuro.png"));
        colori.add(new Card("Viola","./ImmaginiCard/Arte/Colori/viola.png"));

        ArrayList<Card> materialeScolastico = new ArrayList<>();
        materialeScolastico.add(new Card("Astuccio","./ImmaginiCard/Arte/MaterialeScolastico/astuccio.png"));
        materialeScolastico.add(new Card("Calcolatrice","./ImmaginiCard/Arte/MaterialeScolastico/calcolatrice.png"));
        materialeScolastico.add(new Card("Gesso","./ImmaginiCard/Arte/MaterialeScolastico/gesso.png"));
        materialeScolastico.add(new Card("Gomma","./ImmaginiCard/Arte/MaterialeScolastico/gomma.png"));
        materialeScolastico.add(new Card("Libro","./ImmaginiCard/Arte/MaterialeScolastico/libro.png"));
        materialeScolastico.add(new Card("Matita","./ImmaginiCard/Arte/MaterialeScolastico/matita.png"));
        materialeScolastico.add(new Card("Matite Colorate","./ImmaginiCard/Arte/MaterialeScolastico/matiteColorate.png"));
        materialeScolastico.add(new Card("Penna","./ImmaginiCard/Arte/MaterialeScolastico/penna.png"));
        materialeScolastico.add(new Card("Quaderni","./ImmaginiCard/Arte/MaterialeScolastico/quaderni.png"));
        materialeScolastico.add(new Card("Righello","./ImmaginiCard/Arte/MaterialeScolastico/righello.png"));
        materialeScolastico.add(new Card("Temperino","./ImmaginiCard/Arte/MaterialeScolastico/temperino.png"));
        materialeScolastico.add(new Card("Zaino","./ImmaginiCard/Arte/MaterialeScolastico/zaino.png"));

        ArrayList<Card> musica = new ArrayList<>();
        musica.add(new Card("Armonica","./ImmaginiCard/Arte/Musica/armonica.png"));
        musica.add(new Card("Arpa","./ImmaginiCard/Arte/Musica/arpa.png"));
        musica.add(new Card("Batteria","./ImmaginiCard/Arte/Musica/batteria.png"));
        musica.add(new Card("Chitarra classica","./ImmaginiCard/Arte/Musica/chitarraClassica.png"));
        musica.add(new Card("Chitarra Elettrica","./ImmaginiCard/Arte/Musica/chitarraElettrica.png"));
        musica.add(new Card("Clarinetto","./ImmaginiCard/Arte/Musica/clarinetto.png"));
        musica.add(new Card("Fisarmonica","./ImmaginiCard/Arte/Musica/fisarmonica.png"));
        musica.add(new Card("Flauto","./ImmaginiCard/Arte/Musica/flauto.png"));
        musica.add(new Card("Lira","./ImmaginiCard/Arte/Musica/lira.png"));
        musica.add(new Card("Pianoforte","./ImmaginiCard/Arte/Musica/pianoforte.png"));
        musica.add(new Card("Sassofono","./ImmaginiCard/Arte/Musica/sassofono.png"));
        musica.add(new Card("Tamburo","./ImmaginiCard/Arte/Musica/tamburo.png"));
        musica.add(new Card("Triangolo","./ImmaginiCard/Arte/Musica/triangolo.png"));
        musica.add(new Card("Tromba","./ImmaginiCard/Arte/Musica/tromba.png"));
        musica.add(new Card("Violino","./ImmaginiCard/Arte/Musica/violino.png"));
        musica.add(new Card("Xilofono","./ImmaginiCard/Arte/Musica/xilofono.png"));

        ArrayList<Card> vestiti = new ArrayList<>();
        vestiti.add(new Card("Abito","./ImmaginiCard/Arte/Vestiti/abito.png"));
        vestiti.add(new Card("Ballerine","./ImmaginiCard/Arte/Vestiti/ballerine.png"));
        vestiti.add(new Card("Camicia","./ImmaginiCard/Arte/Vestiti/camicia.png"));
        vestiti.add(new Card("Canotta","./ImmaginiCard/Arte/Vestiti/canotta.png"));
        vestiti.add(new Card("Cappotto","./ImmaginiCard/Arte/Vestiti/cappotto.png"));
        vestiti.add(new Card("Felpa","./ImmaginiCard/Arte/Vestiti/felpa.png"));
        vestiti.add(new Card("Giacca","./ImmaginiCard/Arte/Vestiti/giacca.png"));
        vestiti.add(new Card("Gonna","./ImmaginiCard/Arte/Vestiti/gonna.png"));
        vestiti.add(new Card("Impermeabile","./ImmaginiCard/Arte/Vestiti/impermeabile.png"));
        vestiti.add(new Card("Jeans","./ImmaginiCard/Arte/Vestiti/jeans.png"));
        vestiti.add(new Card("Maglietta","./ImmaginiCard/Arte/Vestiti/maglietta.png"));
        vestiti.add(new Card("Maglione","./ImmaginiCard/Arte/Vestiti/maglione.png"));
        vestiti.add(new Card("Mocassini","./ImmaginiCard/Arte/Vestiti/mocassini.png"));
        vestiti.add(new Card("Pantaloni","./ImmaginiCard/Arte/Vestiti/pantaloni.png"));
        vestiti.add(new Card("Scarpe da ginnastica","./ImmaginiCard/Arte/Vestiti/scarpeGinnastica.png"));

        arte.add(new Argomento("Colori",colori));
        arte.add(new Argomento("Materiale Scolastico",materialeScolastico));
        arte.add(new Argomento("Strumenti musicali",musica));
        arte.add(new Argomento("Vestiti",vestiti));



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

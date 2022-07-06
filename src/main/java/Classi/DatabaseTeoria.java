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

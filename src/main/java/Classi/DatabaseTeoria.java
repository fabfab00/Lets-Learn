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
        ArrayList<Card> alfabeto = new ArrayList<>();
        ArrayList<Card> alimenti = new ArrayList<>();
        ArrayList<Card> personeMestieri = new ArrayList<>();
        ArrayList<Card> verbi = new ArrayList<>();

        alfabeto.add(new Card("a","./ImmaginiCard/Italiano/Alfabeto/a.png"));
        alfabeto.add(new Card("bi","./ImmaginiCard/Italiano/Alfabeto/b.png"));
        alfabeto.add(new Card("ci","./ImmaginiCard/Italiano/Alfabeto/c.png"));
        alfabeto.add(new Card("di","./ImmaginiCard/Italiano/Alfabeto/d.png"));
        alfabeto.add(new Card("e","./ImmaginiCard/Italiano/Alfabeto/e.png"));
        alfabeto.add(new Card("effe","./ImmaginiCard/Italiano/Alfabeto/f.png"));
        alfabeto.add(new Card("gi","./ImmaginiCard/Italiano/Alfabeto/g.png"));
        alfabeto.add(new Card("acca","./ImmaginiCard/Italiano/Alfabeto/h.png"));
        alfabeto.add(new Card("i","./ImmaginiCard/Italiano/Alfabeto/i.png"));
        alfabeto.add(new Card("elle","./ImmaginiCard/Italiano/Alfabeto/l.png"));
        alfabeto.add(new Card("emme","./ImmaginiCard/Italiano/Alfabeto/m.png"));
        alfabeto.add(new Card("enne","./ImmaginiCard/Italiano/Alfabeto/n.png"));
        alfabeto.add(new Card("o","./ImmaginiCard/Italiano/Alfabeto/o.png"));
        alfabeto.add(new Card("pi","./ImmaginiCard/Italiano/Alfabeto/p.png"));
        alfabeto.add(new Card("qu","./ImmaginiCard/Italiano/Alfabeto/q.png"));
        alfabeto.add(new Card("erre","./ImmaginiCard/Italiano/Alfabeto/r.png"));
        alfabeto.add(new Card("esse","./ImmaginiCard/Italiano/Alfabeto/s.png"));
        alfabeto.add(new Card("ti","./ImmaginiCard/Italiano/Alfabeto/t.png"));
        alfabeto.add(new Card("u","./ImmaginiCard/Italiano/Alfabeto/u.png"));
        alfabeto.add(new Card("vi","./ImmaginiCard/Italiano/Alfabeto/v.png"));
        alfabeto.add(new Card("zeta","./ImmaginiCard/Italiano/Alfabeto/z.png"));

        alimenti.add(new Card("Acqua","./ImmaginiCard/Italiano/Alimenti/acqua.png"));
        alimenti.add(new Card("Arachidi","./ImmaginiCard/Italiano/Alimenti/arachidi.png"));
        alimenti.add(new Card("Burro","./ImmaginiCard/Italiano/Alimenti/burro.png"));
        alimenti.add(new Card("Caffe","./ImmaginiCard/Italiano/Alimenti/caffe.png"));
        alimenti.add(new Card("Caramelle","./ImmaginiCard/Italiano/Alimenti/caramelle.png"));
        alimenti.add(new Card("Cioccolato","./ImmaginiCard/Italiano/Alimenti/cioccolato.png"));
        alimenti.add(new Card("Cocco","./ImmaginiCard/Italiano/Alimenti/cocco.png"));
        alimenti.add(new Card("Farina","./ImmaginiCard/Italiano/Alimenti/farina.png"));
        alimenti.add(new Card("Formaggio","./ImmaginiCard/Italiano/Alimenti/formaggio.png"));
        alimenti.add(new Card("Frutta","./ImmaginiCard/Italiano/Alimenti/frutta.png"));
        alimenti.add(new Card("Latte","./ImmaginiCard/Italiano/Alimenti/latte.png"));
        alimenti.add(new Card("Miele","./ImmaginiCard/Italiano/Alimenti/miele.png"));
        alimenti.add(new Card("Pane","./ImmaginiCard/Italiano/Alimenti/pane.png"));
        alimenti.add(new Card("Panino","./ImmaginiCard/Italiano/Alimenti/panino.png"));
        alimenti.add(new Card("Pasta","./ImmaginiCard/Italiano/Alimenti/pasta.png"));
        alimenti.add(new Card("Patatine","./ImmaginiCard/Italiano/Alimenti/patatine.png"));
        alimenti.add(new Card("Pesce","./ImmaginiCard/Italiano/Alimenti/pesce.png"));
        alimenti.add(new Card("Pizza","./ImmaginiCard/Italiano/Alimenti/pizza.png"));
        alimenti.add(new Card("Pollo","./ImmaginiCard/Italiano/Alimenti/pollo.png"));
        alimenti.add(new Card("Riso","./ImmaginiCard/Italiano/Alimenti/riso.png"));
        alimenti.add(new Card("Sale e Pepe","./ImmaginiCard/Italiano/Alimenti/saleEpepe.png"));
        alimenti.add(new Card("Torta","./ImmaginiCard/Italiano/Alimenti/torta.png"));
        alimenti.add(new Card("Uova","./ImmaginiCard/Italiano/Alimenti/uovo.png"));
        alimenti.add(new Card("Verdura","./ImmaginiCard/Italiano/Alimenti/verdura.png"));

        personeMestieri.add(new Card("Artista","./ImmaginiCard/Italiano/PersoneMestieri/artista.png"));
        personeMestieri.add(new Card("Atleta","./ImmaginiCard/Italiano/PersoneMestieri/atleta.png"));
        personeMestieri.add(new Card("Attore","./ImmaginiCard/Italiano/PersoneMestieri/attore.png"));
        personeMestieri.add(new Card("Avvocato","./ImmaginiCard/Italiano/PersoneMestieri/avvocato.png"));
        personeMestieri.add(new Card("Barbiere","./ImmaginiCard/Italiano/PersoneMestieri/barbiere.png"));
        personeMestieri.add(new Card("Calciatore","./ImmaginiCard/Italiano/PersoneMestieri/calciatore.png"));
        personeMestieri.add(new Card("Cameriere","./ImmaginiCard/Italiano/PersoneMestieri/cameriere.png"));
        personeMestieri.add(new Card("Casalinga","./ImmaginiCard/Italiano/PersoneMestieri/casalinga.png"));
        personeMestieri.add(new Card("Commesso","./ImmaginiCard/Italiano/PersoneMestieri/commesso.png"));
        personeMestieri.add(new Card("Cuoco","./ImmaginiCard/Italiano/PersoneMestieri/cuoco.png"));
        personeMestieri.add(new Card("Dottore","./ImmaginiCard/Italiano/PersoneMestieri/dottore.png"));
        personeMestieri.add(new Card("Impiegato","./ImmaginiCard/Italiano/PersoneMestieri/impiegato.png"));
        personeMestieri.add(new Card("Ingegnere","./ImmaginiCard/Italiano/PersoneMestieri/ingegnere.png"));
        personeMestieri.add(new Card("Maestra","./ImmaginiCard/Italiano/PersoneMestieri/maestra.png"));
        personeMestieri.add(new Card("Meccanico","./ImmaginiCard/Italiano/PersoneMestieri/meccanico.png"));
        personeMestieri.add(new Card("Militare","./ImmaginiCard/Italiano/PersoneMestieri/militare.png"));
        personeMestieri.add(new Card("Muratore","./ImmaginiCard/Italiano/PersoneMestieri/muratore.png"));
        personeMestieri.add(new Card("Musicista","./ImmaginiCard/Italiano/PersoneMestieri/musicista.png"));
        personeMestieri.add(new Card("Parrucchiere","./ImmaginiCard/Italiano/PersoneMestieri/parrucchiere.png"));
        personeMestieri.add(new Card("Pilota","./ImmaginiCard/Italiano/PersoneMestieri/pilota.png"));
        personeMestieri.add(new Card("Politico","./ImmaginiCard/Italiano/PersoneMestieri/politico.png"));
        personeMestieri.add(new Card("Poliziotto","./ImmaginiCard/Italiano/PersoneMestieri/poliziotto.png"));
        personeMestieri.add(new Card("Pompiere","./ImmaginiCard/Italiano/PersoneMestieri/pompiere.png"));
        personeMestieri.add(new Card("Programmatore","./ImmaginiCard/Italiano/PersoneMestieri/programmatore.png"));
        personeMestieri.add(new Card("Scienziato","./ImmaginiCard/Italiano/PersoneMestieri/scienziato.png"));
        personeMestieri.add(new Card("Scrittore","./ImmaginiCard/Italiano/PersoneMestieri/scrittore.png"));

        verbi.add(new Card("Abbracciare","./ImmaginiCard/Italiano/Verbi/abbracciare.png"));
        verbi.add(new Card("Aiutare","./ImmaginiCard/Italiano/Verbi/aiutare.png"));
        verbi.add(new Card("Allenarsi","./ImmaginiCard/Italiano/Verbi/allenarsi.png"));
        verbi.add(new Card("Ascoltare","./ImmaginiCard/Italiano/Verbi/ascoltare.png"));
        verbi.add(new Card("Ballare","./ImmaginiCard/Italiano/Verbi/ballare.png"));
        verbi.add(new Card("Comprare","./ImmaginiCard/Italiano/Verbi/comprare.png"));
        verbi.add(new Card("Cucinare","./ImmaginiCard/Italiano/Verbi/cucinare.png"));
        verbi.add(new Card("Dormire","./ImmaginiCard/Italiano/Verbi/dormire.png"));
        verbi.add(new Card("Guidare","./ImmaginiCard/Italiano/Verbi/guidare.png"));
        verbi.add(new Card("Lavorare","./ImmaginiCard/Italiano/Verbi/lavorare.png"));
        verbi.add(new Card("Leggere","./ImmaginiCard/Italiano/Verbi/leggere.png"));
        verbi.add(new Card("Litigare","./ImmaginiCard/Italiano/Verbi/litigare.png"));
        verbi.add(new Card("Mangiare","./ImmaginiCard/Italiano/Verbi/mangiare.png"));
        verbi.add(new Card("Pagare","./ImmaginiCard/Italiano/Verbi/pagare.png"));
        verbi.add(new Card("Parlare","./ImmaginiCard/Italiano/Verbi/parlare.png"));
        verbi.add(new Card("Pensare","./ImmaginiCard/Italiano/Verbi/pensare.png"));
        verbi.add(new Card("Pregare","./ImmaginiCard/Italiano/Verbi/pregare.png"));
        verbi.add(new Card("Pulire","./ImmaginiCard/Italiano/Verbi/pulire.png"));
        verbi.add(new Card("Rilassarsi","./ImmaginiCard/Italiano/Verbi/rilassarsi.png"));
        verbi.add(new Card("Scegliere","./ImmaginiCard/Italiano/Verbi/scegliere.png"));
        verbi.add(new Card("Scrivere","./ImmaginiCard/Italiano/Verbi/scrivere.png"));
        verbi.add(new Card("Sgridare","./ImmaginiCard/Italiano/Verbi/sgridare.png"));
        verbi.add(new Card("Sperare","./ImmaginiCard/Italiano/Verbi/sperare.png"));
        verbi.add(new Card("Spingere","./ImmaginiCard/Italiano/Verbi/spingere.png"));
        verbi.add(new Card("Spostare","./ImmaginiCard/Italiano/Verbi/spostare.png"));
        verbi.add(new Card("Starnutire","./ImmaginiCard/Italiano/Verbi/starnutire.png"));
        verbi.add(new Card("Svegliarsi","./ImmaginiCard/Italiano/Verbi/svegliarsi.png"));
        verbi.add(new Card("Truccarsi","./ImmaginiCard/Italiano/Verbi/truccarsi.png"));
        verbi.add(new Card("Usare il pc","./ImmaginiCard/Italiano/Verbi/usarePC.png"));
        verbi.add(new Card("Vedere","./ImmaginiCard/Italiano/Verbi/vedere.png"));
        verbi.add(new Card("Vestirsi","./ImmaginiCard/Italiano/Verbi/vestirsi.png"));



        italiano.add(new Argomento("Verbi",verbi));
        italiano.add(new Argomento("Persone e Mestieri",personeMestieri));
        italiano.add(new Argomento("Alfabeto",alfabeto));
        italiano.add(new Argomento("Alimenti",alimenti));

    }

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

    private void creaStoria(){
        ArrayList<Card> civilta = new ArrayList<>();
        ArrayList<Card> divinitaGreche = new ArrayList<>();
        ArrayList<Card> orario = new ArrayList<>();
        ArrayList<Card> tempo = new ArrayList<>();

        civilta.add(new Card("Africani","./ImmaginiCard/Storia/Civilta/africani.png"));
        civilta.add(new Card("Antichi greci","./ImmaginiCard/Storia/Civilta/antichiGreci.png"));
        civilta.add(new Card("Antichi romani","./ImmaginiCard/Storia/Civilta/antichiRomani.png"));
        civilta.add(new Card("Cinesi","./ImmaginiCard/Storia/Civilta/cinesi.png"));
        civilta.add(new Card("Coreani","./ImmaginiCard/Storia/Civilta/coreani.png"));
        civilta.add(new Card("Egiziani","./ImmaginiCard/Storia/Civilta/egiziani.png"));
        civilta.add(new Card("Francesi","./ImmaginiCard/Storia/Civilta/francesi.png"));
        civilta.add(new Card("Giapponesi","./ImmaginiCard/Storia/Civilta/giapponesi.png"));
        civilta.add(new Card("Indiani d'America","./ImmaginiCard/Storia/Civilta/indianiAmerica.png"));
        civilta.add(new Card("Inglesi","./ImmaginiCard/Storia/Civilta/inglesi.png"));
        civilta.add(new Card("Maya","./ImmaginiCard/Storia/Civilta/maya.png"));
        civilta.add(new Card("Russi","./ImmaginiCard/Storia/Civilta/russi.png"));
        civilta.add(new Card("Spagnoli","./ImmaginiCard/Storia/Civilta/spagnoli.png"));
        civilta.add(new Card("Statunitensi","./ImmaginiCard/Storia/Civilta/statunitensi.png"));
        civilta.add(new Card("Tedeschi","./ImmaginiCard/Storia/Civilta/tedeschi.png"));
        civilta.add(new Card("Thailandesi","./ImmaginiCard/Storia/Civilta/thailandia.png"));
        civilta.add(new Card("Vichinghi","./ImmaginiCard/Storia/Civilta/vichinghi.png"));

        divinitaGreche.add(new Card("Ade","./ImmaginiCard/Storia/DivinitaGreche/ade.png"));
        divinitaGreche.add(new Card("Afrodite","./ImmaginiCard/Storia/DivinitaGreche/afrodite.png"));
        divinitaGreche.add(new Card("Apollo","./ImmaginiCard/Storia/DivinitaGreche/apollo.png"));
        divinitaGreche.add(new Card("Ares","./ImmaginiCard/Storia/DivinitaGreche/ares.png"));
        divinitaGreche.add(new Card("Artemide","./ImmaginiCard/Storia/DivinitaGreche/artemide.png"));
        divinitaGreche.add(new Card("Atena","./ImmaginiCard/Storia/DivinitaGreche/atena.png"));
        divinitaGreche.add(new Card("Demetra","./ImmaginiCard/Storia/DivinitaGreche/demetra.png"));
        divinitaGreche.add(new Card("Dioniso","./ImmaginiCard/Storia/DivinitaGreche/dioniso.png"));
        divinitaGreche.add(new Card("Efesto","./ImmaginiCard/Storia/DivinitaGreche/efesto.png"));
        divinitaGreche.add(new Card("Era","./ImmaginiCard/Storia/DivinitaGreche/era.png"));
        divinitaGreche.add(new Card("Ermes","./ImmaginiCard/Storia/DivinitaGreche/ermes.png"));
        divinitaGreche.add(new Card("Poseidone","./ImmaginiCard/Storia/DivinitaGreche/poseidone.png"));
        divinitaGreche.add(new Card("Zeus","./ImmaginiCard/Storia/DivinitaGreche/zeus.png"));

        orario.add(new Card("Mezzanotte o mezzogiorno","./ImmaginiCard/Storia/Orario/mezzanotte.png"));
        orario.add(new Card("L'una o le tredici","./ImmaginiCard/Storia/Orario/uno.png"));
        orario.add(new Card("Le due o le quattordici","./ImmaginiCard/Storia/Orario/due.png"));
        orario.add(new Card("Le tre o le quindici","./ImmaginiCard/Storia/Orario/tre.png"));
        orario.add(new Card("Le quattro o le sedici","./ImmaginiCard/Storia/Orario/quattro.png"));
        orario.add(new Card("Le cinque o le diciassette","./ImmaginiCard/Storia/Orario/cinque.png"));
        orario.add(new Card("Le sei o le diciotto","./ImmaginiCard/Storia/Orario/sei.png"));
        orario.add(new Card("Le sette o le diciannove","./ImmaginiCard/Storia/Orario/sette.png"));
        orario.add(new Card("Le otto o le venti","./ImmaginiCard/Storia/Orario/otto.png"));
        orario.add(new Card("Le nove o le ventuno","./ImmaginiCard/Storia/Orario/nove.png"));
        orario.add(new Card("Le dieci o le ventidue","./ImmaginiCard/Storia/Orario/dieci.png"));
        orario.add(new Card("Le undici o le ventitrè","./ImmaginiCard/Storia/Orario/undici.png"));


        tempo.add(new Card("Primavera","./ImmaginiCard/Storia/Tempo/primavera.png"));
        tempo.add(new Card("Estate","./ImmaginiCard/Storia/Tempo/estate.png"));
        tempo.add(new Card("Autunno","./ImmaginiCard/Storia/Tempo/autunno.png"));
        tempo.add(new Card("Inverno","./ImmaginiCard/Storia/Tempo/inverno.png"));
        tempo.add(new Card("Mattina","./ImmaginiCard/Storia/Tempo/mattina.png"));
        tempo.add(new Card("Pomeriggio","./ImmaginiCard/Storia/Tempo/pomeriggio.png"));
        tempo.add(new Card("Sera","./ImmaginiCard/Storia/Tempo/sera.png"));
        tempo.add(new Card("Notte","./ImmaginiCard/Storia/Tempo/notte.png"));


        storia.add(new Argomento("Civiltà",civilta));
        storia.add(new Argomento("Divinità greche",divinitaGreche));
        storia.add(new Argomento("Orario",orario));
        storia.add(new Argomento("Tempo",tempo));

    }

    private void creaMatematica(){
        ArrayList<Card> formeGeometriche = new ArrayList<>();
        ArrayList<Card> numeri = new ArrayList<>();
        ArrayList<Card> simboli = new ArrayList<>();
        ArrayList<Card> tecnologie = new ArrayList<>();

        formeGeometriche.add(new Card("Cerchio","./ImmaginiCard/Matematica/FormeGeometrice/cerchio.png"));
        formeGeometriche.add(new Card("Decagono","./ImmaginiCard/Matematica/FormeGeometrice/decagono.png"));
        formeGeometriche.add(new Card("Esagono","./ImmaginiCard/Matematica/FormeGeometrice/esagono.png"));
        formeGeometriche.add(new Card("Ettagono","./ImmaginiCard/Matematica/FormeGeometrice/ettagono.png"));
        formeGeometriche.add(new Card("Ottagono","./ImmaginiCard/Matematica/FormeGeometrice/ottagono.png"));
        formeGeometriche.add(new Card("Parallelogramma","./ImmaginiCard/Matematica/FormeGeometrice/parallellogramma.png"));
        formeGeometriche.add(new Card("Pentagono","./ImmaginiCard/Matematica/FormeGeometrice/pentagono.png"));
        formeGeometriche.add(new Card("Quadrato","./ImmaginiCard/Matematica/FormeGeometrice/quadrato.png"));
        formeGeometriche.add(new Card("Rettangolo","./ImmaginiCard/Matematica/FormeGeometrice/cerchio.png"));
        formeGeometriche.add(new Card("Rombo","./ImmaginiCard/Matematica/FormeGeometrice/rombo.png"));
        formeGeometriche.add(new Card("Trapezio","./ImmaginiCard/Matematica/FormeGeometrice/trapezio.png"));
        formeGeometriche.add(new Card("Triangolo","./ImmaginiCard/Matematica/FormeGeometrice/triangolo.png"));

        numeri.add(new Card("Zero","./ImmaginiCard/Matematica/Numeri/zero.png"));
        numeri.add(new Card("Uno","./ImmaginiCard/Matematica/Numeri/uno.png"));
        numeri.add(new Card("Due","./ImmaginiCard/Matematica/Numeri/due.png"));
        numeri.add(new Card("Tre","./ImmaginiCard/Matematica/Numeri/tre.png"));
        numeri.add(new Card("Quattro","./ImmaginiCard/Matematica/Numeri/quattro.png"));
        numeri.add(new Card("Cinque","./ImmaginiCard/Matematica/Numeri/cinque.png"));
        numeri.add(new Card("Sei","./ImmaginiCard/Matematica/Numeri/sei.png"));
        numeri.add(new Card("Sette","./ImmaginiCard/Matematica/Numeri/sette.png"));
        numeri.add(new Card("Otto","./ImmaginiCard/Matematica/Numeri/otto.png"));
        numeri.add(new Card("Nove","./ImmaginiCard/Matematica/Numeri/nove.png"));

        simboli.add(new Card("Diviso","./ImmaginiCard/Matematica/Simboli/diviso.png"));
        simboli.add(new Card("Euro","./ImmaginiCard/Matematica/Simboli/euro.png"));
        simboli.add(new Card("Infinito","./ImmaginiCard/Matematica/Simboli/infinito.png"));
        simboli.add(new Card("Maggiore","./ImmaginiCard/Matematica/Simboli/maggiore.png"));
        simboli.add(new Card("Minore","./ImmaginiCard/Matematica/Simboli/minore.png"));
        simboli.add(new Card("Parentesi graffe","./ImmaginiCard/Matematica/Simboli/parentesiGraffe.png"));
        simboli.add(new Card("Parentesi quadre","./ImmaginiCard/Matematica/Simboli/parentesiQuadre.png"));
        simboli.add(new Card("Parentesi tonde","./ImmaginiCard/Matematica/Simboli/parentesiTonde.png"));
        simboli.add(new Card("Per","./ImmaginiCard/Matematica/Simboli/per.png"));
        simboli.add(new Card("Percentuale","./ImmaginiCard/Matematica/Simboli/percentuale.png"));
        simboli.add(new Card("Più","./ImmaginiCard/Matematica/Simboli/piu.png"));
        simboli.add(new Card("Punto Esclamativo","./ImmaginiCard/Matematica/Simboli/puntoEsclamativo.png"));
        simboli.add(new Card("Punto interrogativo","./ImmaginiCard/Matematica/Simboli/puntoInterrogativo.png"));
        simboli.add(new Card("Radice quadrata","./ImmaginiCard/Matematica/Simboli/radiceQuadrata.png"));
        simboli.add(new Card("Uguale","./ImmaginiCard/Matematica/Simboli/uguale.png"));

        tecnologie.add(new Card("Auricolari","./ImmaginiCard/Matematica/Tecnologie/auricolari.png"));
        tecnologie.add(new Card("Automobile","./ImmaginiCard/Matematica/Tecnologie/automobile.png"));
        tecnologie.add(new Card("Computer","./ImmaginiCard/Matematica/Tecnologie/computer.png"));
        tecnologie.add(new Card("Computer portatile","./ImmaginiCard/Matematica/Tecnologie/computerPortatile.png"));
        tecnologie.add(new Card("Cuffie","./ImmaginiCard/Matematica/Tecnologie/cuffie.png"));
        tecnologie.add(new Card("Lavagna Multimediale","./ImmaginiCard/Matematica/Tecnologie/lavagnaMultimediale.png"));
        tecnologie.add(new Card("Moto","./ImmaginiCard/Matematica/Tecnologie/moto.png"));
        tecnologie.add(new Card("Sveglia digitale","./ImmaginiCard/Matematica/Tecnologie/svegliaDigitale.png"));
        tecnologie.add(new Card("Sveglia analogica","./ImmaginiCard/Matematica/Tecnologie/svegliAnalogica.png"));
        tecnologie.add(new Card("Tastiera","./ImmaginiCard/Matematica/Tecnologie/tastiera.png"));
        tecnologie.add(new Card("Vespa","./ImmaginiCard/Matematica/Tecnologie/vespa.png"));


        matematica.add(new Argomento("Forme Geometriche",formeGeometriche));
        matematica.add(new Argomento("I Numeri",numeri));
        matematica.add(new Argomento("Simboli",simboli));
        matematica.add(new Argomento("Tecnologia",tecnologie));

    }

    private void creaScienze(){
        ArrayList<Card> Piante = new ArrayList<>();
        ArrayList<Card> Animali = new ArrayList<>();
        ArrayList<Card> Sport = new ArrayList<>();
        ArrayList<Card> partiDelCorpo = new ArrayList<>();

        Piante.add(new Card("Bambu","./ImmaginiCard/Scienze/Piante/bambu.png"));
        Piante.add(new Card("Cactus","./ImmaginiCard/Scienze/Piante/cactus.png"));
        Piante.add(new Card("Ciliegio","./ImmaginiCard/Scienze/Piante/ciliegio.png"));
        Piante.add(new Card("Prezzemolo","./ImmaginiCard/Scienze/Piante/img.png"));
        Piante.add(new Card("Margherita","./ImmaginiCard/Scienze/Piante/margherita.png"));
        Piante.add(new Card("Menta","./ImmaginiCard/Scienze/Piante/menta.png"));
        Piante.add(new Card("Orchidea","./ImmaginiCard/Scienze/Piante/orchidea.png"));
        Piante.add(new Card("Papavero","./ImmaginiCard/Scienze/Piante/papavero.png"));
        Piante.add(new Card("Pino","./ImmaginiCard/Scienze/Piante/pino.png"));
        Piante.add(new Card("Rosa","./ImmaginiCard/Scienze/Piante/rosa.png"));
        Piante.add(new Card("Rosmarino","./ImmaginiCard/Scienze/Piante/rosmarino.png"));
        Piante.add(new Card("Salice piangente","./ImmaginiCard/Scienze/Piante/salicePiangente.png"));
        Piante.add(new Card("Tulipano","./ImmaginiCard/Scienze/Piante/tulipano.png"));
        Piante.add(new Card("Ulivo","./ImmaginiCard/Scienze/Piante/ulivo.png"));



        Animali.add(new Card("Cammello","./ImmaginiCard/Scienze/Animali/cammello.png"));
        Animali.add(new Card("Cane","./ImmaginiCard/Scienze/Animali/cane.png"));
        Animali.add(new Card("Coniglio","./ImmaginiCard/Scienze/Animali/coniglio.png"));
        Animali.add(new Card("Elefante","./ImmaginiCard/Scienze/Animali/elefante.png"));
        Animali.add(new Card("Fenicottero","./ImmaginiCard/Scienze/Animali/fenicottero.png"));
        Animali.add(new Card("Gallina","./ImmaginiCard/Scienze/Animali/gallina.png"));
        Animali.add(new Card("Gallo","./ImmaginiCard/Scienze/Animali/gallo.png"));
        Animali.add(new Card("Gatto","./ImmaginiCard/Scienze/Animali/gatto.png"));
        Animali.add(new Card("Giraffa","./ImmaginiCard/Scienze/Animali/giraffa.png"));
        Animali.add(new Card("Leone","./ImmaginiCard/Scienze/Animali/leone.png"));
        Animali.add(new Card("Mucca","./ImmaginiCard/Scienze/Animali/mucca.png"));
        Animali.add(new Card("Pappagallo","./ImmaginiCard/Scienze/Animali/pappagallo.png"));
        Animali.add(new Card("Pecora","./ImmaginiCard/Scienze/Animali/pecora.png"));
        Animali.add(new Card("Pulcino","./ImmaginiCard/Scienze/Animali/pulcino.png"));
        Animali.add(new Card("Rana","./ImmaginiCard/Scienze/Animali/rana.png"));
        Animali.add(new Card("Scimmia","./ImmaginiCard/Scienze/Animali/scimmia.png"));
        Animali.add(new Card("Serpente","./ImmaginiCard/Scienze/Animali/serpente.png"));
        Animali.add(new Card("Tartaruga","./ImmaginiCard/Scienze/Animali/tartaruga.png"));
        Animali.add(new Card("Tigre","./ImmaginiCard/Scienze/Animali/tiger.png"));
        Animali.add(new Card("Topo","./ImmaginiCard/Scienze/Animali/topo.png"));
        Animali.add(new Card("Volpe","./ImmaginiCard/Scienze/Animali/volpe.png"));
        Animali.add(new Card("Zebra","./ImmaginiCard/Scienze/Animali/zebra.png"));

        Sport.add(new Card("Calcio", "./ImmaginiCard/Scienze/Sports/calcio.png"));
        Sport.add(new Card("Ciclismo", "./ImmaginiCard/Scienze/Sports/ciclismo.png"));
        Sport.add(new Card("Danza", "./ImmaginiCard/Scienze/Sports/danza.png"));
        Sport.add(new Card("Nuoto", "./ImmaginiCard/Scienze/Sports/nuoto.png"));
        Sport.add(new Card("Pallacanestro", "./ImmaginiCard/Scienze/Sports/pallacanestro.png"));
        Sport.add(new Card("Pallavolo", "./ImmaginiCard/Scienze/Sports/pallavolo.png"));
        Sport.add(new Card("Pattinaggio Artistico", "./ImmaginiCard/Scienze/Sports/pattinaggioArtistico.png"));
        Sport.add(new Card("Scherma", "./ImmaginiCard/Scienze/Sports/scherma.png"));
        Sport.add(new Card("Sci", "./ImmaginiCard/Scienze/Sports/sci.png"));
        Sport.add(new Card("Tennis", "./ImmaginiCard/Scienze/Sports/tennis.png"));

        partiDelCorpo.add(new Card("braccio","./ImmaginiCard/Scienze/PartiCorpo/braccio.png"));
        partiDelCorpo.add(new Card("collo","./ImmaginiCard/Scienze/PartiCorpo/collo.png"));
        partiDelCorpo.add(new Card("dita","./ImmaginiCard/Scienze/PartiCorpo/dita.png"));
        partiDelCorpo.add(new Card("fronte","./ImmaginiCard/Scienze/PartiCorpo/fronte.png"));
        partiDelCorpo.add(new Card("gamba","./ImmaginiCard/Scienze/PartiCorpo/gamba.png"));
        partiDelCorpo.add(new Card("ginocchio","./ImmaginiCard/Scienze/PartiCorpo/ginocchio.png"));
        partiDelCorpo.add(new Card("guance","./ImmaginiCard/Scienze/PartiCorpo/guance.png"));
        partiDelCorpo.add(new Card("labbra","./ImmaginiCard/Scienze/PartiCorpo/labbra.png"));
        partiDelCorpo.add(new Card("lingua","./ImmaginiCard/Scienze/PartiCorpo/lingua.png"));
        partiDelCorpo.add(new Card("mano","./ImmaginiCard/Scienze/PartiCorpo/mano.png"));
        partiDelCorpo.add(new Card("naso","./ImmaginiCard/Scienze/PartiCorpo/naso.png"));
        partiDelCorpo.add(new Card("occhio","./ImmaginiCard/Scienze/PartiCorpo/occhio.png"));
        partiDelCorpo.add(new Card("orecchio","./ImmaginiCard/Scienze/PartiCorpo/orecchio.png"));
        partiDelCorpo.add(new Card("pancia","./ImmaginiCard/Scienze/PartiCorpo/pancia.png"));
        partiDelCorpo.add(new Card("petto","./ImmaginiCard/Scienze/PartiCorpo/petto.png"));
        partiDelCorpo.add(new Card("piedi","./ImmaginiCard/Scienze/PartiCorpo/piedi.png"));
        partiDelCorpo.add(new Card("schiena","./ImmaginiCard/Scienze/PartiCorpo/schiena.png"));
        partiDelCorpo.add(new Card("spalla","./ImmaginiCard/Scienze/PartiCorpo/spalla.png"));


        scienze.add(new Argomento("Piante",Piante));
        scienze.add(new Argomento("Animali",Animali));
        scienze.add(new Argomento("Sport",Sport));
        scienze.add(new Argomento("Parti del corpo",partiDelCorpo));
  }

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

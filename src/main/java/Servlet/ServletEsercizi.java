package Servlet;

import Classi.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletEsercizi", value = "/ServletEsercizi")
public class ServletEsercizi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String materiaString= request.getParameter("materia");
        String argomentoString = request.getParameter("argomento");
        ArrayList<EserciziPerArgomento> arrayList=new ArrayList<>();
        DatabaseEsercizi databaseEsercizi=new DatabaseEsercizi();
        EserciziPerArgomento eserciziPerArgomento;
        ArrayList<AssociaImmagineConParola> associaImmagineConParola;
        ArrayList<AssociaLeFrasiTraDiloro> associaLeFrasiTraDiloro;
        ArrayList<ScriviLaparolaCorretta> scriviLaparolaCorretta;
        switch (materiaString){
            case "Italiano" :
                arrayList=databaseEsercizi.getItaliano();
                System.out.println("Argomento String in servlet esercizi: "+ argomentoString);
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            case "Storia":
                arrayList=databaseEsercizi.getStoria();
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            case "Geografia" :
                arrayList=databaseEsercizi.getGeografia();
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            case "Matematica" :
                arrayList=databaseEsercizi.getMatematica();
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            case "Arte" :
                arrayList=databaseEsercizi.getArte();
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            case "Scienze" :
                arrayList=databaseEsercizi.getScienze();
                eserciziPerArgomento= databaseEsercizi.getEserciziPerArgomentobyNome(argomentoString, arrayList);
                associaImmagineConParola=eserciziPerArgomento.getEsercizioAssociaImmagineConParola();
                associaLeFrasiTraDiloro=eserciziPerArgomento.getEsercizioAssociaLeFrasiTraDiLoro();
                scriviLaparolaCorretta= eserciziPerArgomento.getEsercizioScriviLaParolaCorretta();
                request.setAttribute("associaImmagineConParola", associaImmagineConParola.get(0));
                request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro.get(0));
                request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta.get(0));
                request.setAttribute("argomento", argomentoString);
                break;
            default: break;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/AssegnaEsercizio.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package Servlet;

import Classi.AssociaImmagineConParola;
import Classi.AssociaLeFrasiTraDiloro;
import Classi.ScriviLaparolaCorretta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAvviaPrimoEsercizio", value = "/ServletAvviaPrimoEsercizio")
public class ServletAvviaPrimoEsercizio extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String EsercizioUno = request.getParameter("EsercizioUno");
        String EsercizioDue = request.getParameter("EsercizioDue");
        String EsercizioTre = request.getParameter("EsercizioTre");


        if(EsercizioUno.equalsIgnoreCase("ciao"))
        {
            int counter= (int) request.getSession().getAttribute("counter");
            counter++;
            request.getSession().setAttribute("counter", counter);
            EsercizioUno = (String) request.getSession().getAttribute("EsercizioUno");
            EsercizioDue = (String) request.getSession().getAttribute("EsercizioDue");
            EsercizioTre = (String) request.getSession().getAttribute("EsercizioTre");
            request.getSession().setAttribute("EsercizioUno", EsercizioUno);
            request.getSession().setAttribute("EsercizioDue", EsercizioDue);
            request.getSession().setAttribute("EsercizioTre", EsercizioTre);
        }
        else{

            int counter=1;
            request.getSession().setAttribute("counter", counter);
            request.getSession().setAttribute("EsercizioUno", EsercizioUno);
            request.getSession().setAttribute("EsercizioDue", EsercizioDue);
            request.getSession().setAttribute("EsercizioTre", EsercizioTre);
            int total=0;
            if(EsercizioUno.equalsIgnoreCase("true"))
            {
                total++;
            }
            if(EsercizioDue.equalsIgnoreCase("true"))
            {
                total++;
            }
            if(EsercizioDue.equalsIgnoreCase("true"))
            {
                total++;
            }
            request.getSession().setAttribute("total", total);
        }


        AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getSession().getAttribute("associaLeFrasiTraDiloro");
        AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getSession().getAttribute("associaImmagineConParola");
        ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getSession().getAttribute("scriviLaparolaCorretta");
        request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro);
        request.setAttribute("associaImmagineConParola", associaImmagineConParola);
        request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta);

        String Tipologia=request.getParameter("Tipologia");
        String Risposta=request.getParameter("Risposta");
        System.out.println("Risposta in Servlet: "+Risposta);

        if(Tipologia!=null) {

            switch (Tipologia) {
                case "AssociaImmagineConParola":
                    int number = associaImmagineConParola.cercaPosizioneByString(Risposta);
                    associaImmagineConParola.setRispostaUtente(number);
                    break;

                case "AssociaLeFrasiTraDiLoro":
                    String RispostaBis=request.getParameter("RispostaBis");
                    int numberOne=associaLeFrasiTraDiloro.cercaPosizioneByString1(Risposta);
                    int numberTwo=associaLeFrasiTraDiloro.cercaPosizioneByString2(RispostaBis);
                    System.out.println("Risposta bis: "+RispostaBis);
                    associaLeFrasiTraDiloro.setRispostaUtente1(numberOne);
                    associaLeFrasiTraDiloro.setRispostaUtente2(numberTwo);
                    break;

                case "ScriviLaparolaCorretta":
                    scriviLaparolaCorretta.setRispostaUtente(Risposta);
                    break;

                default:
                    break;
            }
        }

        for(int i=0;i<3;i++) {


            if (EsercizioUno.equalsIgnoreCase("true")) {
                String ese1= "vero";
                request.getSession().setAttribute("Ese1", ese1);
                EsercizioUno = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioAssociaImmagineConParola.jsp");
                dispatcher.forward(request, response);
                return;

            }
            if (EsercizioDue.equalsIgnoreCase("true")) {
                String ese2= "vero";
                request.getSession().setAttribute("Ese2", ese2);
                EsercizioDue = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioAssociaLeFrasiTraDiLoro.jsp");
                dispatcher.forward(request, response);
                return;
            }
            if (EsercizioTre.equalsIgnoreCase("true")) {
                String ese3= "vero";
                request.getSession().setAttribute("Ese3", ese3);
                EsercizioTre = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioScriviLaParolaCorretta.jsp");
                dispatcher.forward(request, response);
                return;
            }

        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/ConclusioneEsercizio.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

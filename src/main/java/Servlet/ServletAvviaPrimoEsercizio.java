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

            EsercizioUno = (String) request.getSession().getAttribute("EsercizioUno");
            EsercizioDue = (String) request.getSession().getAttribute("EsercizioDue");
            EsercizioTre = (String) request.getSession().getAttribute("EsercizioTre");
            System.out.println("ifCiao");
            System.out.println(EsercizioUno);
            System.out.println(EsercizioDue);
            System.out.println(EsercizioTre);
            request.getSession().setAttribute("EsercizioUno", EsercizioUno);
            request.getSession().setAttribute("EsercizioDue", EsercizioDue);
            request.getSession().setAttribute("EsercizioTre", EsercizioTre);

        }
        else{

            request.getSession().setAttribute("EsercizioUno", EsercizioUno);
            request.getSession().setAttribute("EsercizioDue", EsercizioDue);
            request.getSession().setAttribute("EsercizioTre", EsercizioTre);


        }


        AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getSession().getAttribute("associaLeFrasiTraDiloro");
        AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getSession().getAttribute("associaImmagineConParola");
        ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getSession().getAttribute("scriviLaparolaCorretta");
        request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro);
        request.setAttribute("associaImmagineConParola", associaImmagineConParola);
        request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta);

        for(int i=0;i<3;i++) {


            if (EsercizioUno.equalsIgnoreCase("true")) {
                EsercizioUno = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                System.out.println("ifUno");
                System.out.println(EsercizioDue);
                System.out.println(EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioAssociaImmagineConParola.jsp");
                dispatcher.forward(request, response);
                break;

            }
            if (EsercizioDue.equalsIgnoreCase("true")) {
                EsercizioDue = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                System.out.println("ifDue");
                System.out.println(EsercizioDue);
                System.out.println(EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioAssociaLeFrasiTraDiLoro.jsp");
                dispatcher.forward(request, response);
                break;
            }
            if (EsercizioTre.equalsIgnoreCase("true")) {
                EsercizioTre = "false";
                request.getSession().setAttribute("EsercizioUno", EsercizioUno);
                request.getSession().setAttribute("EsercizioDue", EsercizioDue);
                request.getSession().setAttribute("EsercizioTre", EsercizioTre);
                System.out.println("ifTre");
                System.out.println(EsercizioDue);
                System.out.println(EsercizioTre);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Partials/EsercizioScriviLaParolaCorretta.jsp");
                dispatcher.forward(request, response);
                break;
            }

        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/ConclusioneEsercizio.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

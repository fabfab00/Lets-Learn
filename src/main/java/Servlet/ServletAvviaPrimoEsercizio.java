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
        AssociaLeFrasiTraDiloro associaLeFrasiTraDiloro= (AssociaLeFrasiTraDiloro) request.getSession().getAttribute("associaLeFrasiTraDiloro");
        AssociaImmagineConParola associaImmagineConParola= (AssociaImmagineConParola) request.getSession().getAttribute("associaImmagineConParola");
        ScriviLaparolaCorretta scriviLaparolaCorretta= (ScriviLaparolaCorretta) request.getSession().getAttribute("scriviLaparolaCorretta");
        request.setAttribute("associaLeFrasiTraDiloro", associaLeFrasiTraDiloro);
        request.setAttribute("associaImmagineConParola", associaImmagineConParola);
        request.setAttribute("scriviLaparolaCorretta", scriviLaparolaCorretta);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/SvolgiEsercizio.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

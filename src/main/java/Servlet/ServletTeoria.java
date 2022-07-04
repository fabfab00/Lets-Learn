package Servlet;

import Classi.Argomento;
import Classi.Database;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletTeoria", value = "/ServletTeoria")
public class ServletTeoria extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String materiaString= request.getParameter("materia");
        String argomentoString = request.getParameter("argomento");
        Database db = new Database();
        ArrayList<Argomento> listaArgomentiGrammatica = db.getGrammatica();
        Argomento argomento = db.getArgomentoByNome(listaArgomentiGrammatica,argomentoString);
        HttpSession session = request.getSession(true);
        session.setAttribute("argomentoClass",argomento);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/Teoria.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

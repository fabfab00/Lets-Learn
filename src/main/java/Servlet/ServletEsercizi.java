package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletEsercizi", value = "/ServletEsercizi")
public class ServletEsercizi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String materiaString= request.getParameter("materia");
        String argomentoString = request.getParameter("argomento");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/AssegnaEsercizio.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

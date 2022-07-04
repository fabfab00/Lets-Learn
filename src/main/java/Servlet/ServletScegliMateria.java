package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletScegliMateria", value = "/ServletScegliMateria")
public class ServletScegliMateria extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String materia = request.getParameter("materia");
        String path="";
        ArrayList<String> argomenti = new ArrayList<>();
        switch (materia) {

            case "Grammatica":
                argomenti.add("Ortografia");
                argomenti.add("Comunicazione");
                argomenti.add("Lessico");
                argomenti.add("Morfologia");
                path="/WEB-INF/General/Argomento.jsp";

                break;
            case "Matematica":
                argomenti.add("I numeri");
                argomenti.add("Le misure");
                argomenti.add("Geometria");
                argomenti.add("Gli insiemi");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Geostoria":
                argomenti.add("Fonti Storiche");
                argomenti.add("Sumeri");
                argomenti.add("Babilonesi");
                argomenti.add("Assiri");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Scienze":
                argomenti.add("Il metodo scientifico");
                argomenti.add("Le piante");
                argomenti.add("Gli animali");
                argomenti.add("Le rocce");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            default:

                break;
        }
        /*altra prova prova prova*/
        HttpSession session = request.getSession(true);
        session.setAttribute("materia",materia);
        session.setAttribute("argomenti",argomenti);
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

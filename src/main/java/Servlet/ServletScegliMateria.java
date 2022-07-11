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

            case "Italiano":
                argomenti.add("Alfabeto");
                argomenti.add("Verbi");
                argomenti.add("Alimenti");
                argomenti.add("Persone e Mestieri");
                path="/WEB-INF/General/Argomento.jsp";

                break;
            case "Matematica":
                argomenti.add("I numeri");
                argomenti.add("Forme geometriche");
                argomenti.add("Simboli");
                argomenti.add("Tecnologia");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Geografia":
                argomenti.add("Pianeti");
                argomenti.add("Posizioni");
                argomenti.add("Paesaggi");
                argomenti.add("Luoghi cittadini");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Scienze":
                argomenti.add("Piante");
                argomenti.add("Animali");
                argomenti.add("Sport");
                argomenti.add("Parti del corpo");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Storia":
                argomenti.add("Civiltà");
                argomenti.add("Divinità greche");
                argomenti.add("Orario");
                argomenti.add("Tempo");
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Arte":
                argomenti.add("Colori");
                argomenti.add("Strumenti musicali");
                argomenti.add("Vestiti");
                argomenti.add("Materiale scolastico");
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

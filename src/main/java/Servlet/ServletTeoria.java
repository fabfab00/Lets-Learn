package Servlet;

import Classi.Argomento;
import Classi.DatabaseTeoria;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletTeoria", value = "/ServletTeoria")
public class ServletTeoria extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Argomento> listaArgomentiMateria;
        String materiaString= request.getParameter("materia");
        String argomentoString = request.getParameter("argomento");

        DatabaseTeoria db = new DatabaseTeoria();
        switch (materiaString){
            case "Italiano": listaArgomentiMateria=db.getItaliano(); break;
            case "Matematica": listaArgomentiMateria=db.getMatematica(); break;
            case "Scienze": listaArgomentiMateria=db.getScienze(); break;
            case "Arte": {System.out.println("Sono nel case arte");listaArgomentiMateria=db.getArte();  break;}
            case "Geografia": listaArgomentiMateria=db.getGeografia(); break;
            case "Storia": listaArgomentiMateria=db.getStoria(); break;
            default: listaArgomentiMateria=null;
        }



        Argomento argomento = db.getArgomentoByNome(listaArgomentiMateria,argomentoString);
        System.out.println(argomento.toString());
        HttpSession session = request.getSession(true);
        session.setAttribute("argomentoClass",argomento);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/General/Teoria.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

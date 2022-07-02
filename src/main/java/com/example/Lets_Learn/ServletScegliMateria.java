package com.example.Lets_Learn;

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
        switch (materia) {

            case "Italiano":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Matematica":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Storia":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Geografia":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Scienze":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            case "Educazionecivica":
                path="/WEB-INF/General/Argomento.jsp";
                break;
            default:
                break;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

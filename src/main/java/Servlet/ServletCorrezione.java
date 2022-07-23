package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCorrezione", value = "/ServletCorrezione")
public class ServletCorrezione extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ese1String = (String) request.getSession().getAttribute("Ese1");
        String ese2String = (String) request.getSession().getAttribute("Ese2");
        String ese3String = (String) request.getSession().getAttribute("Ese3");
        String path;

        if(request.getSession().getAttribute("counterBis")==null)
        {
            int counterBis=1;
            System.out.println(counterBis);
            request.getSession().setAttribute("counterBis", counterBis);
        }else {
            int counterBis= (int) request.getSession().getAttribute("counterBis");
            counterBis++;
            if(counterBis>(int)request.getSession().getAttribute("total"))
            {
                counterBis=0;
            }
            System.out.println(counterBis);

            request.getSession().setAttribute("counterBis", counterBis);
        }

        if( ese1String!=null && ese1String.equals("vero")){
            ese1String="falso";
            request.getSession().setAttribute("Ese1",ese1String);
            path="/WEB-INF/Partials/CorrezioneEsercizioAssociaImmagineConParola.jsp";
        }
        else if(ese2String!=null && ese2String.equals("vero")){
            ese2String="falso";
            request.getSession().setAttribute("Ese2",ese2String);
            path="/WEB-INF/Partials/CorrezioneEsercizioAssociaLeFrasiTraDiLoro.jsp";
        }
        else if( ese3String!=null &&  ese3String.equals("vero")){
            ese3String="falso";
            request.getSession().setAttribute("Ese3",ese3String);
            path="/WEB-INF/Partials/CorrezioneEsercizioScriviLaParolaCorretta.jsp";
        }
        else if((ese1String==null || ese1String.equals("falso") ) && (ese2String==null || ese2String.equals("falso") ) && (ese3String==null || ese3String.equals("falso"))){

            path="index.jsp";
        }
        else{
            path="/WEB-INF/General/ErrorPage.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

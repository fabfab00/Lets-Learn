package Servlet;



import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "ServletDizionario", value = "/ServletDizionario")
public class ServletDizionario extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
                String parola = request.getParameter("parola");
                StringBuilder content;
                resp.setContentType("plain/text");
                resp.setCharacterEncoding("UTF-8");
                String line;
                URL url = new URL("https://www.grandidizionari.it/Dizionario_Italiano/parola/"+parola.toUpperCase().charAt(0)+"/"+parola.toLowerCase()+".aspx?query="+parola.toLowerCase());


                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");

                connection.setDoOutput(true);
                try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {




                        try (BufferedReader in = new BufferedReader(
                                new InputStreamReader(connection.getInputStream()))) {
                                content = new StringBuilder();
                                while ((line = in.readLine()) != null) {
                                        content.append(line);
                                        content.append(System.lineSeparator());
                                }
                        }
                        System.out.println(content.toString());
                } finally {
                        connection.disconnect();
                }

                String x = StringUtils.substringBetween(content.toString(),parola.toLowerCase()+"</span><br>","<div style=\"color:#035a9c");
                System.out.println(x);
                if(x == null)
                        x = "Non trovato";
                resp.getWriter().write(x);
        }
}

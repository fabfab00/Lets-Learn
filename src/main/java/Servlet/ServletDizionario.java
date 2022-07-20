package Servlet;



import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
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
                URL url = new URL("https://www.grandidizionari.it/Dizionario_Italiano/cerca.aspx");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("POST");
                Map<String, String> params = new HashMap<>();
                params.put("query", parola.toLowerCase());
                params.put("Cerca","cerca");

                StringBuilder postData = new StringBuilder();
                for (Map.Entry<String, String> param : params.entrySet()) {
                        if (postData.length() != 0) {
                                postData.append('&');
                        }
                        postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                        postData.append('=');
                        postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
                }

                byte[] postDataBytes = postData.toString().getBytes("UTF-8");
                connection.setDoOutput(true);
                try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {
                        writer.write(postDataBytes);



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

                String x = StringUtils.substringBetween(content.toString(),"<span class=lemma>"+parola.toLowerCase()+"</span>","<div style=\"color:#035a9c");
                System.out.println(x);
                if(x == null)
                        x = "Non trovato";
                resp.getWriter().write(x);
        }
}

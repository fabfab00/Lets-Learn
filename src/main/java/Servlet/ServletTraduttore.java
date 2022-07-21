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

@WebServlet(name = "ServletTraduttore", value = "/ServletTraduttore")
public class ServletTraduttore extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String testo = request.getParameter("testo");
        String lingua1 = request.getParameter("lingua1");
        String lingua2 = request.getParameter("lingua2");
        resp.setContentType("plain/text");
        resp.setCharacterEncoding("UTF-8");
        String line;
        StringBuilder content;

        URL url = new URL("https://duckduckgo.com/translation.js?vqd=3-135972121648383306651520592915873137605-231243556034453055971497326002225197655&query=traduttore&from=it&to=en");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();


        connection.setRequestMethod("POST");
        Map<String, String> params = new HashMap<>();
        params.put("","pane");
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

        resp.getWriter().write(content.toString());
    }
}

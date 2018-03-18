package ir.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/init")
public class IinitTEst extends HttpServlet {
    private int i = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("In doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        i++;

        response.getWriter().print("<h1>i= " + i + "</h1>\n" +
                "<script>\n" +
                "    if(!!window.performance && window.performance.navigation.type === 2)\n" +
                "    {\n" +
                "        console.log('Reloading');\n" +
                "        window.location.reload();\n" +
                "    }\n" +
                "</script>");
        System.out.println("In doGet " + i);
    }

    @Override
    public void init() {

        System.out.println("In init");
    }

    @Override
    public void destroy() {
        System.out.println("In destroy");
    }


}

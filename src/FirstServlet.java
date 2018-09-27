import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by a.shipulin on 27.09.18.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>Hello, " + name + " " + surname + "!</h1>");


        pw.println("</html>");
    }
}

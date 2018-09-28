import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by a.shipulin on 28.09.18.
 */
@WebServlet(name = "DeleteCookiesServlet")
public class DeleteCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie  cookie = new Cookie("some_id", "");
        cookie.setMaxAge(0);

        cookie.setMaxAge(-1);
        response.addCookie(cookie);

    }
}

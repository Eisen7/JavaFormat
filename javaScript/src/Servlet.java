import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Eisen7 on 2017/6/5.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilterInputStream f = (FilterInputStream) request.getSession().getServletContext().getResourceAsStream("");
        InputStream inputStream = f;
        FilterInputStream f2 = f;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}


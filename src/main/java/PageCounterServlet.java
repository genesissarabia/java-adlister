import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="Page Counter Servlet", urlPatterns = "/page+counter")
public class PageCounterServlet extends HttpServlet {
    private int pageHits;

    public void init(){
        pageHits = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        pageHits++;
        PrintWriter out = response.getWriter();
        out.println("Total Page Hits: " + pageHits);

    }

}

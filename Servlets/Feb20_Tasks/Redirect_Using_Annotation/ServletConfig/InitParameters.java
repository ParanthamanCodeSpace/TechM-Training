import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InitParameters extends HttpServlet {   
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();
        String address = config.getInitParameter("address");
        String email = config.getInitParameter("email");
        String phone = config.getInitParameter("phone");

        out.println("<html><body>");
        out.println("<h1>ServletConfig Example (annotation-based)</h1>");
        out.println("<p>Address: " + address + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone: " + phone + "</p>");
        out.println("</body></html>");
        out.close();
    }
}

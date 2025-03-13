package myservpack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			response.setContentType("text/html");      
		       PrintWriter pwriter = response.getWriter();    
		       pwriter.println("<html><body>");
		       pwriter.println("<h2>Html file from Servlet!</h2>");
		       pwriter.println("</body></html>");
		}
	}
	
}

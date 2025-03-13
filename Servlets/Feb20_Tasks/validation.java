package myservpack2;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class validation extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();

        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        if (name.equals("Chaitanya") && pass.equals("beginnersbook")) {
            RequestDispatcher dis = request.getRequestDispatcher("welcome");
            dis.forward(request, response);
        } else {
            pwriter.print("<p style='color:red;'>User name or password is incorrect!</p>");
            RequestDispatcher dis = request.getRequestDispatcher("index.html");
            dis.include(request, response);
        }
    }
}

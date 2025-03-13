package myservpack5;

//Import necessary packages for Servlet functionality
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
* Counter Servlet
* ----------------
* This servlet counts the number of times it has been accessed.
* The counter increments each time a GET request is made.
*/

@WebServlet("/Counter")

public class Counter extends HttpServlet {

 // Instance variable to store the number of times the servlet has been accessed
 // Since servlets are generally singleton objects, this variable persists across multiple requests.
 int accesses = 0;

 /**
  * Handles GET requests.
  * Every time the servlet receives a GET request, the 'accesses' counter is incremented and displayed.
  *
  * @param request  HttpServletRequest object that contains the request from the client
  * @param response HttpServletResponse object for sending the response back to the client
  * @throws IOException if an input or output error occurs
  * @throws ServletException if a servlet-specific error occurs
  */
 public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {

     // Set the response content type to HTML so the browser can interpret it correctly
     response.setContentType("text/html");

     // Get a PrintWriter object to send text data to the client
     PrintWriter out = response.getWriter();

     // Increment the counter each time the servlet is accessed
     accesses++;

     // Display the total number of times the servlet has been accessed
     out.print("<html><body>");
     out.print("<h2>Servlet Access Counter</h2>");
     out.print("<p>Number of times this servlet has been accessed: <strong>" + accesses + "</strong></p>");
     out.print("</body></html>");

     // Close the PrintWriter to free system resources
     out.close();
 }
}


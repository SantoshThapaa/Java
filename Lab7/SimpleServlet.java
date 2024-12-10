import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SimpleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello to you all, Servlet World!</h1>");
        out.println("</body></html>");
    }
}

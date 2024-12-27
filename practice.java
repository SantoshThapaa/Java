<form action="servletjava" method="POST">
Username:<input type="text" name="username">
Password:<input type="text" name="password">
<input type="submit">
</form>

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servletjava extends HttpServlet {
    public void doPost(HttpServletrequest request,HttpServletresponse response) throws IOException,ServletException{
        response.ContentType="text/html";
        PrintWriter out=response.getWriter();

        String username= request.getParameter("user");
        String password= request.getParameter("password");

        out.println("<p>Username:"+Username+"</p>")
        out.println("<p>Password:"+Password+"</p>")
    }
}
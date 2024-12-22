import java.io.*;
import jakarta.servlet.*;

public class First implements Servlet{
    ServletConfig config=null;

    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Servlet is initialized");
    }

    public void service(ServletRequest req,ServletResponse res)
    throws IOException,ServletException{
        res.setContentType("text/html");

        PrintWriter out=res.getWriter();
        out.print("<html><body>");
        out.print("<b>Hello simple servlet fron Santosh.</b>");
        out.print("</body></html>");

    }
    public void destroy(){System.out.println("Servlet is destroyed");}
    public ServletConfig getServletConfig(){return config;}
    public String getServletInfo(){return "copyright 2001-1010";}
    
}

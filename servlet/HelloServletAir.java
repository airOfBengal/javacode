import java.io.*;
import javax.servlet.*;

public class HelloServletAir extends GenericServlet
{
public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
pw.println("<B>Hello</br> AIR!</br><i>"+getServletName());
pw.println("</br>"+request.getRemoteHost());
pw.close();
} // end method service
public String getServletInfo()
{
return "AIR # CSE # PBN";
} // end method getServletInfo
}
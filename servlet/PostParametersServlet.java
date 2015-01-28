import java.io.*;
import java.util.*;
import javax.servlet.*;

public class PostParametersServlet extends GenericServlet{
public void service(ServletRequest request,ServletResponse response)
throws ServletException,IOException {
PrintWriter pw = response.getWriter();
Enumeration e = request.getParameterNames();

while(e.hasMoreElements()){
String name = (String)e.nextElement();
pw.print(name + " = ");
String value = request.getParameter(name);
pw.println(value);
}//end while
pw.close();
}//end service
}//end servlet
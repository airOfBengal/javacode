import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetClientInfoServlet extends HttpServlet{
/*
public void doPost(HttpServletRequest req,HttpServletResponse res) 
throws ServletException,IOException {

res.setContentType("text/html");
res.getWriter().println("Client: "+req.getRemoteUser());

}//end method doPost

public void doGet(HttpServletRequest req,HttpServletResponse res) 
throws ServletException,IOException {

res.setContentType("text/html");
res.getWriter().println("Client: "+req.getRemoteUser());

}//end method doGet
*/
public void service(HttpServletRequest req,HttpServletResponse res) 
throws ServletException,IOException {

res.setContentType("text/html");
res.getWriter().println("Client: ");

}//end method service

}//end class GetClientInfoServlet
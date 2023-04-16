import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ViewHeaderServlet extends HttpServlet {  
  
	public void init() {
		}

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException { 
      
	  response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
      String title = "Assignment 1 Part 2: Displaying Request Headers";
	  String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
      out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                "<BODY>\n" +
                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
				"<TABLE BORDER=1 ALIGN=\"CENTER\" BGCOLOR=\"#DCDCDC\">\n" +
                "<TR BGCOLOR=\"#ff70a0\">\n" +
                "<TH>Header Name<TH>Header Value");
    Enumeration e = request.getHeaderNames();  
        while (e.hasMoreElements()) {  
        String headerName = (String) e.nextElement();  
        String headerValue = request.getHeader(headerName);  
		out.println("<TR><TD>" + headerName);
		out.println("<TD>" + headerValue);
    }
    out.println("</TABLE>\n</BODY></HTML>");

	} 

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        handleRequest(request, response);
    }

    public void destroy() {
    }  
}  
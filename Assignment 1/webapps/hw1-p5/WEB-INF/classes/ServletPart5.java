import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import java.util.*;

public class ServletPart5 extends HttpServlet {

	public void init() {
		
	}
	
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter printWriter  = response.getWriter();

		String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      								"Transitional//EN\">\n";

		printWriter.println(docType + "<HTML>");
		printWriter.println("<BODY>");

		printWriter.print("<h1 COLOR=\"BLUE\" ALIGN=\"CENTER\">HttpServletRequest Methods & Inherited Super Interface ServletRequest Methods</h1>");


		printWriter.print("<BR>\n" +
			                "<TABLE BORDER=2px ALIGN=\"CENTER\" BGCOLOR=\"#DCDCDC\">\n" +
			                "<TR BGCOLOR=\"#ff70a0\">\n" +
			                "<TH>Method Name" +
							"</TH>" +
			                "<TH>Value" +
							"</TH>" +
							"</TR>" +
							
							
							"<TR>\n" +
							"<TD>AuthType" +
							"</TD>" +
							"<TD>" + request.getAuthType() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>ContextPath" +
							"</TD>" +
							"<TD>" + request.getContextPath() +
							"</TD>" +
							"</TR>" + 
							
							"<TR>\n" +
							"<TD>Content Type" +
							"</TD>" +
							"<TD>" + request.getContentType() +
							"</TD>" +
							"</TR>" + 
							
							"<TR>\n" +
							"<TD>Cookies" +
							"</TD>" +
							"<TD>" + request.getCookies() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>DateHeader" +
							"</TD>" +
							"<TD>" + request.getDateHeader("If-Unmodified-Since") +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>RequestedSessionldValid" +
							"</TD>" +
							"<TD>" + request.getHeader("User-Agent") +
							"</TD>" +
							"</TR>" +


							"<TR>\n" +
							"<TD>Connection Header" +
							"</TD>" +
							"<TD>" + request.getHeader("Connection") +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Method" +
							"</TD>" +
							"<TD>" + request.getMethod() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Method" +
							"</TD>" +
							"<TD>" + request.getMethod() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>PathInfo" +
							"</TD>" +
							"<TD>" + request.getPathInfo() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Path Translated" +
							"</TD>" +
							"<TD>" + request.getPathTranslated() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Query String" +
							"</TD>" +
							"<TD>" + request.getQueryString() +
							"</TD>" +
							"</TR>" +


							"<TR>\n" +
							"<TD>RemoteUser" +
							"</TD>" +
							"<TD>" + request.getRemoteUser() +
							"</TD>" +
							"</TR>" + 

							"<TR>\n" +
							"<TD>URI" +
							"</TD>" +
							"<TD>" + request.getRequestURI() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>URL" +
							"</TD>" +
							"<TD>" + request.getRequestURL() +
							"</TD>" +
							"</TR>" +							

							"<TR>\n" +
							"<TD>Servlet Path" +
							"</TD>" +
							"<TD>" + request.getServletPath() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>RequestedSessionId" +
							"</TD>" +
							"<TD>" + request.getRequestedSessionId() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>Session" +
							"</TD>" +
							"<TD>" + request.getSession(true) +
							"</TD>" +
							"</TR>" +

							"<TD>ServerName" +
							"</TD>" +
							"<TD>" + request.getServerName() +
							"</TD>" +
							"</TR>" + 
							
							"<TR>\n" +
							"<TD>AttributeNames" +
							"</TD>" +
							"<TD>" + request.getAttributeNames() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Character Encoding" +
							"</TD>" +
							"<TD>" + request.getCharacterEncoding() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Content Length" +
							"</TD>" +
							"<TD>" + request.getContentLength() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>ServerPort" +
							"</TD>" +
							"<TD>" + request.getServerPort() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Remote Address" +
							"</TD>" +
							"<TD>" + request.getRemoteAddr() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Locale" +
							"</TD>" +
							"<TD>" + request.getLocale() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Remote Host" +
							"</TD>" +
							"<TD>" + request.getRemoteHost() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>DispatcherType" +
							"</TD>" +
							"<TD>" + request.getDispatcherType() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>LocalPort" +
							"</TD>" +
							"<TD>" + request.getLocalPort() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Local Name" +
							"</TD>" +
							"<TD>" + request.getLocalName() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Local Address" +
							"</TD>" +
							"<TD>" + request.getLocalAddr() +
							"</TD>" +
							"</TR>" +
							
							"<TR>\n" +
							"<TD>Real Path" +
							"</TD>" +
							"<TD>" + request.getRealPath("/WEB-INF/classes") +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>ServletContext" +
							"</TD>" +
							"<TD>" + request.getServletContext() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>Protocol" +
							"</TD>" +
							"<TD>" + request.getProtocol() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>Locale" +
							"</TD>" +
							"<TD>" + request.getLocale() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>Attribute Name" +
							"</TD>" +
							"<TD>" + request.getAttribute("serverHost") +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>getReader" +
							"</TD>" +
							"<TD>" + request.getReader() +
							"</TD>" +
							"</TR>" +

							"<TR>\n" +
							"<TD>Scheme" +
							"</TD>" +
							"<TD>" + request.getScheme() +
							"</TD>" +
							"</TR>"

							); 
							

		printWriter.println("</TD");
		printWriter.println("</TH");
		printWriter.println("</TR>");
		printWriter.println("</TABLE><BR><BR>");


		printWriter.println("</BODY>");
		printWriter.println("</HTML>");
	}
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        handleRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handleRequest(request, response);
    }
	
		public void destroy() {
		
	}
}
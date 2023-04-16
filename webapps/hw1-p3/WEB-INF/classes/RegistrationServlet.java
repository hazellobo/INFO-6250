import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    public void init() {
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //Setting response type as HTML
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	//Getting the parameters from the input
	
	
	//writing the paramters on the browser
	String email= request.getParameter("email");
	String password= request.getParameter("password");
	String cpassword= request.getParameter("cpassword");
	String gender= request.getParameter("gender");
	String hobby[]= request.getParameterValues("hobby");
	String address= request.getParameter("address");
	String path=request.getParameter("picture");
	String country=request.getParameter("country");
	//Writing the parameters on the browser
		out.println("<!doctype HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Details</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Submitted Details</h1>");
        out.println("<b>Email: </b>" + email + "<br>");
        out.println("<b>Password: </b>" + password + "<br>");
        out.println("<b>Confirm Password: </b>" + cpassword + "<br>");
		out.println("<b>Your picture: </b>"+path+"<br>");
        out.println("<b>Gender: </b>" + gender + "<br>");
        out.println("<b>Country: </b>" + country + "<br>");
        out.println("<b>Hobbies: </b><br>");
        out.println("<ul>");
        for(String val : hobby){
            out.println("<li>" + val + "</li>");
        }
        out.println("</ul>");
        out.println("<b>Address: </b>" + address + "<br>");
        out.println("</body>");
        out.println("</html>");

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

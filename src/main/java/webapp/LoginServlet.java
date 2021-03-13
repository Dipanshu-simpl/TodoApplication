package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	/**
	 *  @author--- mdipanshu
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Welcome Page</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("My First Servlet");
		writer.println("</body>");
		writer.println("</html>");
	}
}

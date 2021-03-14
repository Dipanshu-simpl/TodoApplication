package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
<<<<<<< HEAD
	
	
	/**
	 *  @author--- mdipanshu
	 *  
	 *  
	 */
	private static final long serialVersionUID = 1L;
=======
	private UserValidationService service=new UserValidationService();
	
>>>>>>> simpleWebServletApp

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		boolean isValid=service.isUserValid(name, password);
		if(isValid)
		{
              request.setAttribute("name",name);
              request.setAttribute("password", password);
              request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}

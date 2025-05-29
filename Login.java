

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)  {
		try {
			//Collect UI data
			String username=req.getParameter("un");
			String password=req.getParameter("up");
			
			//Check wether username and password is matching with data present in DB
			AuthModel authmodel=new AuthModel();
			boolean result=authmodel.validateUser(username, password);
			if(result) {
				res.sendRedirect("/Authentication_Proj1/dashboard.html");
			}
			else {
				res.sendRedirect("/Authentication_Proj1/loginfail.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			// Collect the data from client
			String username=req.getParameter("un");
			String password=req.getParameter("up");
			String email=req.getParameter("ue");
			String phone=req.getParameter("uph");
			
			//Store the data in Data Base
			AuthModel rm=new AuthModel();
			boolean result=rm.persist(username, password, email, phone);
			if(result==true) {
				res.sendRedirect("/Authentication_Proj1/login.html");
			}
			else {
				res.sendRedirect("/Authentication_Proj1/regfail.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

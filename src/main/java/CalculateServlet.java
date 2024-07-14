

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String p =(String)(request.getParameter("principle"));
			String t =(String)(request.getParameter("rate"));
			String r =(String)(request.getParameter("time"));
			 int pr= Integer.parseInt(p);
			 int rate= Integer.parseInt(r);
			 int time= Integer.parseInt(t);
			
			 if (pr <0 && time <0 && rate <0) {
		            RequestDispatcher rd= request.getRequestDispatcher("error.html");
		            rd.forward(request, response);
		         }
			 else {
			int si= (pr*time*rate)/100;
			PrintWriter pw= response.getWriter();
			pw.println(si);
			 }
	}catch(NumberFormatException e) {
		PrintWriter pw= response.getWriter();
		pw.println(e.getMessage());;
		
	}
			
		}
	
}

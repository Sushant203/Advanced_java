

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String principle= request.getParameter("principle");
		
		String rate= request.getParameter("rate");
		
		String time= request.getParameter("time");
		
		
		request.setAttribute("principle", principle);
		request.setAttribute("rate",rate);
		request.setAttribute("time", time);
		RequestDispatcher rd= request.getRequestDispatcher("CalculateServlet");
		rd.forward(request, response);;
		
	}

}

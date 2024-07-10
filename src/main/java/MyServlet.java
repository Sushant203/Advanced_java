

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
		int p= Integer.parseInt(principle);
		String rate= request.getParameter("rate");
		int r= Integer.parseInt(rate);
		String time= request.getParameter("time");
		int t= Integer.parseInt(time);
		int SI= (p*t*r)/100;
		
		PrintWriter out= response.getWriter();
		out.println("simple interest is :"+ SI);
		
	}

}

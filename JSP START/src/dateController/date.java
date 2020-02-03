package dateController;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/date")
public class date extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Date d = new Date();
		SimpleDateFormat sf =new SimpleDateFormat("yyyy년 MM월 dd일");
		String fd =sf.format(d);
		
		System.out.println(fd);
		req.setAttribute("fd", fd);
		
		RequestDispatcher dispacher =  req.getRequestDispatcher("date.jsp"); 
		dispacher.forward(req, resp); // req 와 resp 를 공유 할수 있는 공간 
		
		
	}

}

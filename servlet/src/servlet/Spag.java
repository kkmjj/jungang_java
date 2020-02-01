package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;


@WebServlet("/spag")
public class Spag extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num=0;
		String num_ = req.getParameter("n");
		if(num_!=null && !num_.equals(""))
		{
			num =Integer.parseInt(num_);
		}
		
		String result;
		
		if(num%2==0) { result="짝수";}
		else {
			result="홀수";
		}
		
		req.setAttribute("result", result);  // req에 값을 담고 
		
		Map<String, Object>  notice = new HashMap<String, Object>();
		notice.put("name", "김민준");
		notice.put("id", 1);
		
		req.setAttribute("notice", notice);
		// 둘사이에 연결 하는 저장소 - > java -> jsp = forwrading / redirect 
		
		// forwarding 현재 작업 하는 것을 이어가는거 
		 
		RequestDispatcher dispacher =  req.getRequestDispatcher("spag.jsp"); 
		dispacher.forward(req, resp); // req 와 resp 를 공유 할수 있는 공간 
		
		
		
		
	}
	
	
	

}

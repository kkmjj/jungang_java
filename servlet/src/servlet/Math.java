package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;


@WebServlet("/Math")		// 어노테이션 기법
public class Math extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String before = req.getParameter("before");
		String after = req.getParameter("after");
		
		int I_before=Integer.parseInt(before);
		int I_after=Integer.parseInt(after);
		
		out.print(I_before+I_after);
		
		
		
	}

}

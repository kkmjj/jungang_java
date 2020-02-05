package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;


@WebServlet("/calc3")		// 어노테이션 기법
public class calc3 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// ServletContext application= req.getServletContext();
		resp.setCharacterEncoding("UTF-8");
		
		Cookie[] cookies =req.getCookies();
		
		//HttpSession session = req.getSession();
		
		
		//PrintWriter out = resp.getWriter();
		
		String v_ = req.getParameter("v");
		String op = req.getParameter("operator");
		
		int v=0;
		
	if(!v_.equals("")) v = Integer.parseInt(v_);
	int reuslt=v;
	if(op.equals("="))
	{
		
		//int x=(Integer) application.getAttribute("value");
		//int x=(Integer) session.getAttribute("value");
		
		int x=0;
		for ( Cookie c : cookies) 
		{
			if(c.getName().equals("value")) 
			{
				
				x=Integer.parseInt(c.getValue());
				break;
			}
		}
		
		int y= v;
		//String operator = (String) application.getAttribute("op");
		//String operator = (String) session.getAttribute("op");
		String operator ="";
		for ( Cookie c : cookies) 
		{
			if(c.getName().equals("op")) 
			{
				operator=c.getValue();
				break;
			}
		}
		
		
		if(operator.equals("+"))
		{
			reuslt =x+y;
		}
		else 
		{
			reuslt =x-y;
		}
		
		resp.getWriter().println(reuslt);
	}
	else
	{
	
//	application.setAttribute("value", v);
	//application.setAttribute("op", op);	// application 방식
		
		
//	session.setAttribute("value", v);
//	session.setAttribute("op", op);			// session 방식 
	
	//	int I_before=Integer.parseInt(before);
	//	int I_after=Integer.parseInt(after);
		
		Cookie valuecookie =new Cookie("value",String.valueOf(v));
		Cookie opcookie =new Cookie("op",op);
		//valuecookie.setPath("/notice/"); notice 가 포함된 url을 가져올경우 쿠키를 가져와라 
		valuecookie.setPath("/");
		opcookie.setPath("/");
		//valuecookie.setMaxAge(1000);
		resp.addCookie(valuecookie);
		resp.addCookie(opcookie); // client에게 전달 
		
		resp.sendRedirect("calc2.html");
		
		
	}
	
	
	
		
		
	}

}

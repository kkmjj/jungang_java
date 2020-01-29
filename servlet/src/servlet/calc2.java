package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;


@WebServlet("/calc2")		// 어노테이션 기법
public class calc2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		ServletContext application= req.getServletContext();
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String v_ = req.getParameter("v");
		String op = req.getParameter("operator");
		int reuslt=0;
		int v=0;
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
	if(op.equals("="))
	{
		
		int x=(Integer) application.getAttribute("value");
		int y= v;
		String operator = (String) application.getAttribute("op");
		if(operator.equals("+"))
		{
			reuslt =x+y;
		}
		else 
		{
			reuslt =x-y;
		}
	}
	else
	{
	
	application.setAttribute("value", v);
	application.setAttribute("op", op);	
	//	int I_before=Integer.parseInt(before);
	//	int I_after=Integer.parseInt(after);
	}
	
	
		resp.getWriter().println(reuslt);
		
		
	}

}

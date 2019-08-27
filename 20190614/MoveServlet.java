package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MoveServlet
 */
@WebServlet("/move")
public class MoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String website = request.getParameter("action");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>전달된 쿼리 문자열이 없어서 MoveServlet이 직접 응답합니다.</h2>");
		
		if(website.equals("naver"))
		response.sendRedirect("http://www."+website+".com/");
		else if(website.equals("daum"))
		response.sendRedirect("http://www."+website+".net/");
		else if(website.equals("google"))
		response.sendRedirect("http://www."+website+".com/");	
			
	}

}

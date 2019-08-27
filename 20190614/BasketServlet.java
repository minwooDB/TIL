package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/basket")
public class BasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String place = request.getParameter("pid");
	response.setContentType("text/html; charset=utf-8");
	PrintWriter out = response.getWriter();
	out.print("<h1>선택한 상품 :"+place+"</h1>");
	out.print("<a href ='"+request.getHeader("referer")+"'>상품 선택화면으로 가기</a>");
}
}


package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.MemberVO;

	@WebServlet("/member")
	public class MemberServlet extends HttpServlet {
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String name =request.getParameter("name");
			String phone = request.getParameter("phone");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			MemberVO vo = new MemberVO();
			//vo.response.setContentType("text/html; charset=UTF-8");
		
		  if(id == "") 
			  vo.setId("없음");
		  else 
			  vo.setId(id);
		  if(name == "")
			  vo.setName("없음");
		  else 
			  vo.setName(name);
		  if( password == "") 
			  password = "없음"; 
		  else
		  vo.setPassword(password);  
		  
		  if( phone == "") 
			  phone = "없음"; 
		  else
			vo.setPhone(phone);
			request.setAttribute("objreq", vo);
			request.getRequestDispatcher("/jspexam/memberView.jsp").
			              forward(request, response);
}
	}

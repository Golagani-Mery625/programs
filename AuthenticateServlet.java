package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


import com.del.first.dao.UsersDAO;
import com.del.first.entity.Users;
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet  extends HttpServlet 
{
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
  {
	  response.setContentType("text/html");
	  String username=request.getParameter("uid");
	  String password=request.getParameter("pwd");
	  Cookie c=new Cookie("username",username);
	  response.addCookie(c);
	  Users u=new Users(username,password);
	  RequestDispatcher rd=null;
	  PrintWriter out=response.getWriter();
	  out.println("<h1><center>");
	  if(new UsersDAO().validateUser(u))
	  {
		 // out.println("welcome to website");
		  rd=request.getRequestDispatcher("services.html");
	      rd.forward(request,response);
	  }
	  else
	  {
		  out.println("Invalid Username/Password");
		  rd=request.getRequestDispatcher("login.html");
		  rd.include(request, response);
	  }
	  out.println("</center></h1>");
  }
}

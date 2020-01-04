package com.del.courses.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.courses.entity.Courses;
import com.del.courses.entity.CoursesDAO;

@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String submit=request.getParameter("sub");
		CoursesDAO edao=new CoursesDAO();
		Courses c=new Courses();
		String message="succesfully";
		c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
		RequestDispatcher rd=request.getRequestDispatcher("CoursesCrud.jsp");
		if(submit.contentEquals("Add_Course") || submit.equals("Modify_Course"))
			{
			  
			   c.setCourse_name(request.getParameter("course_name"));
			   c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
			   c.setCourse_duration(Integer.parseInt(request.getParameter("course_duration")));
			   
			if(submit.equals("Add_Course"))
			   {
				   edao.insertCourses(c);
				   message  = message+"Inserted Record";
			   }
			   else
			   {
				   edao.modifyCourses(c);
				   message=message+" Modified Records";
				   
			   }
				   
			}
		else if(submit.equals("Delete_Course"))
		{
			if(edao.removeCourses(c.getCourse_id()))
				message=message+"Record Deleted";
			else
				message="Deletion Failed";
		}
		else if(submit.equals("Show_Course"))
		{
			c=edao.getCourses(c.getCourse_id());
		    request.setAttribute("cor", c);
		}
		
		out.print("<h1><center>");
		out.print(message);
		out.print("</center></h1>");
		rd.include(request,response);
    }

	}

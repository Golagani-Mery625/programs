<%@page import="com.del.courses.entity.Courses, com.del.courses.entity.CoursesDAO" %>
<%
   Courses e=(Courses)request.getAttribute("cor");
   if(e==null) e=new Courses();
%>
<html>
<body>
<form action="CoursesCrudServlet">
   <table align=center width=50% bgcolor=lightblue>
   <tr>
     <th>Course Id</th>
     <td><input type=text name=course_id value=<%=e.getCourse_id()%>></td>
     </tr>
     <tr>
       <th>course Name</th>
       <td><input type=text name=course_name value=<%=e.getCourse_name()%>></td>
       </tr>
       <tr>
       <th>course fee</th>
       <td><input type=text name=course_fee value=<%=e.getCourse_fee()%>></td>
       </tr>
       <tr>
       <th>course duration</th>
       <td><input type=text name=course_duration value=<%=e.getCourse_duration()%>></td>
       </tr>
       <tr>
       <td><input type=submit value=Add_Course name="sub"></td>
       <td><input type=submit value=Show_Course name="sub"></td>
       </tr>
       <tr>
          <td><input type=submit value=Delete_Course name="sub"></td>
          <td><input type=submit value=Modify_Course name="sub"></td>
          </tr>
       
   </table>
   </form>

 </body>
</html>
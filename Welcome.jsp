<%@page import="java.util.Date,java.sql.*,java.io.IOException" %>
<!DOCTYPE html>
<html>
<body>
   <% 
        for(int i=1;i<10;i++)
        {
        	out.print(i+"<br>");
   %>
   <br>
   <%
        }
   %>
   <%=new java.util.Date() +"<br>"%>
   <%= 2*(2+1)/2 %>
</body>
</html>
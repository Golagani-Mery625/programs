package com.del.courses.entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.del.courses.entity.Courses;
public class CoursesDAO
{
	@SuppressWarnings("finally")
	public boolean insertCourses(Courses cor)
	{
		int count=0;
		Connection con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("insert into courses values(?,?,?,?)");
			pst.setInt(1, cor.getCourse_id()); pst.setString(2,cor.getCourse_name());
			pst.setInt(3, cor.getCourse_duration()); pst.setDouble(4, cor.getCourse_fee());
			count=pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		return count==1;
		}
	}
	public boolean modifyCourses(Courses cor)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("update  courses set course_name=?,course_duration=?,course_fee=? where course_id =?");
			pst.setString(1, cor.getCourse_name());pst.setInt(2,cor.getCourse_duration());
			pst.setDouble(3, cor.getCourse_fee()); 
			count=pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count==1;
	}
	public boolean removeCourses(int course_id)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("delete from courses where course_id=?");
			pst.setInt(1, course_id);
			count=pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count==1;
	}
	public Courses getCourses(int course_id)
	{
		Courses cor=null;
		Connection  con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("select * from Courses where course_id=?");
			pst.setInt(1, course_id);
			rs=pst.executeQuery();
			if(rs.next())
				cor=new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
				if(rs!=null)rs.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return cor;
	}
	public ArrayList<Courses>getCourses()
	{
		ArrayList<Courses> elist=new ArrayList<Courses>();
		Connection  con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("select * from employee" );
			rs=pst.executeQuery();
			while(rs.next())
				  elist.add(new Courses(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return elist;
	}
	
}

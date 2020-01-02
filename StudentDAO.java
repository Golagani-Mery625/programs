package com.del.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.del.entity.*;

public class StudentDAO 
{
	public boolean insertStudent(Student stu)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("insert into Student values(?,?,?,?)");
			pst.setInt(1, stu.getRno());pst.setString(2,stu.getName());
			pst.setInt(3, stu.getAge()); pst.setDate(4,stu.getDoj());
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
	public boolean modifyStudent(Student stu)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("update Student set name=?,age=? where rno=?");
			pst.setInt(1, stu.getRno());pst.setString(2,stu.getName());
			pst.setInt(3, stu.getAge()); pst.setDate(4,stu.getDoj());
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
	public boolean removeStudent(int rno)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("delete from Student where rno=?");
			pst.setInt(1, rno);
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
	public Student getStudent(int rno)
	{
		Student stu=null;
		Connection  con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("select * from Student where rno=?");
			pst.setInt(1,rno);
			rs=pst.executeQuery();
			if(rs.next())
				stu=new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
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
				if(rs!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return stu;
	}
	public ArrayList<Student>getStudent()
	{
		ArrayList<Student> slist=new ArrayList<Student>();
		Connection  con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("select * from student" );
			rs=pst.executeQuery();
			while(rs.next())
				  slist.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4)));
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
		return slist;
	}
	
}

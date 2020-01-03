package com.del.second.entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.del.second.entity.Employee;

public class EmployeeDAO 
{

	public boolean insertEmployee(Employee emp)
	{
		int count=0;
		Connection  con=null;
		PreparedStatement pst=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, emp.getEmpid());pst.setString(2,emp.getName());
			pst.setDouble(3, emp.getSalary()); pst.setDate(4, emp.getDoj());
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
public boolean modifyEmployee(Employee emp)
{
	int count=0;
	Connection  con=null;
	PreparedStatement pst=null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,"scott","tiger");
		pst=con.prepareStatement("update  employee set name=?,salary=? where empno=?");
		pst.setInt(1, emp.getEmpid());pst.setString(2,emp.getName());
		pst.setDouble(3, emp.getSalary()); pst.setDate(4, emp.getDoj());
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
public boolean removeEmployee(int eno)
{
	int count=0;
	Connection  con=null;
	PreparedStatement pst=null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,"scott","tiger");
		pst=con.prepareStatement("delete from employee where eno=?");
		pst.setInt(1, eno);
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

public Employee getEmployee(int empid)
{
	Employee emp=null;
	Connection  con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,"scott","tiger");
		pst=con.prepareStatement("select * from employee where empid=?");
		pst.setInt(1, empid);
		rs=pst.executeQuery();
		if(rs.next())
			emp=new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4));
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
	return emp;
}
public ArrayList<Employee>getEmployee()
{
	ArrayList<Employee> elist=new ArrayList<Employee>();
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
			  elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4)));
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

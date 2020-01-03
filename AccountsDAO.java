package com.del.first.dao;
import java.sql.*;
public class AccountsDAO
{
      public boolean updateBalance(String username,double amount)
      {
    	  int count=0;
    	  String url="jdbc:oracle:thin:@localhost:1521:orcl";
    	  Connection con=null;
    	  PreparedStatement pst=null;
    	  try
    	  {
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    		 con=DriverManager.getConnection(url,"scott","tiger");
    		 pst=con.prepareStatement("update accounts set balance=balance-? where username=?");
    		 pst.setDouble(1, amount); pst.setString(2, username);
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
}

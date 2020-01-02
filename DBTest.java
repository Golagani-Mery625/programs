import java.sql.*;
public class DBTest 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con=null;
		CallableStatement st=null;
		ResultSet rs=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,"scott","tiger");
		st=con.prepareCall("call insertMaster(?,?,?)");
		st.setInt(1, 102);  st.setString(2, "babu raja"); st.setDouble(3, 12345.67);
		st.setInt(1, 103);  st.setString(2, "man");    st.setDouble(3,24356.89);
		st.setInt(1, 104);  st.setString(2, "mery");   st.setDouble(3, 24653.78);
		st.executeUpdate();
		}
	    catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(con!=null)con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
				
			}
		}
   }

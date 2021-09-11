package jdbcDemo;

import java.sql.*;
import java.util.ArrayList;

public class Demo {
	public static final String driver="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/user";
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		
		
		try 
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,"root","root");
			System.out.println(con);
			String query="select * from employee";
			ps=con.prepareStatement(query) ;
			ResultSet rs=ps.executeQuery(query); 
			while(rs.next())
			{
				System.out.println(rs.getInt("empid")+"\t"+rs.getString("empname"));
				
			}
			
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		finally {
			
			try {
				if(ps!=null)
					ps.close();
					System.out.println("ps close");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
				System.out.println("con close");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}

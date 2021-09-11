package jdbcDemo;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class EmpConnection {
	
	public static final String driver="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/user";
	
	public static Connection con=null;
	public static ArrayList<Employee> list=new ArrayList<Employee>();
		
	public static void getConnection(String user,String password)
	{
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connected successfully....");
			
		} catch (Exception e)
		{
			System.out.println("Problem occured while creating connection");
			e.printStackTrace();
		}
		
	}
	
	public static void closeConnection()
	{
		
		try {
			if(con!=null)
				con.close();
			System.out.println("Connection Closed....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		final String user=sc.next();
		System.out.println("Enter the Password:");
		final String password=sc.next();
		
		
		
		
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		
		
		String query="select * from employee";
		try
		{
		getConnection(user,password);
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery(query); 
		while(rs.next())
		{
			int a=rs.getInt("empid");
			String st=rs.getString("empname");
			System.out.println(a+"\t"+st);
			list.add(new Employee(st,a));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		PreparedStatement ps=null;
		try {
		ps = con.prepareStatement("update employee set empname=? where empid=?");
		
		ps.setString(1,"ram");
		ps.setInt(2, 1);
		ps.executeUpdate();
		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
		closeConnection();
		System.out.println("List content:");
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			Employee temp=itr.next();
			System.out.println(temp.getEmpId()+"\t"+temp.getEmpName());
			
		}
		
		}

}

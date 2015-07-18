package foodonlineordering;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DBOperation {

	public ResultSet select(String qry)
	{
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		con=DBConnection.getConnection();
		try {
			st=con.createStatement();
			
			rs=st.executeQuery(qry);
			/*ResultSetMetaData rsmd=rs.getMetaData();
			
			int cols=rsmd.getColumnCount();
			for(int i=1;i<=cols;i++)
				System.out.print(rsmd.getColumnName(i)+"  		");
			
			System.out.println("");
			
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void insert()
	{
		Connection con=null;
		PreparedStatement pst=null;
		
		con=DBConnection.getConnection();
		String ans="";
		try {
		Scanner sc=new Scanner(System.in);	
		pst=con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
		
		do
		{
			System.out.println("enter id:");
			String s1=sc.next();
			
			System.out.println("enter name");
			String s2=sc.next();
			
			System.out.println("enter salary");
			double d=Double.parseDouble(sc.next());
			
			
			System.out.println("enter city");
			String s4=sc.next();
			
			System.out.println("enter designation");
			String s5=sc.next();
			
			System.out.println("enter dept id");
			String s6=sc.next();
			
			pst.setString(1, s1);
			pst.setString(2, s2);
			pst.setDouble(3, d);
			pst.setString(4, s4);
			pst.setString(5, s5);
			pst.setString(6, s6);
			
			int row=pst.executeUpdate();
			
			if(row>=1)
				System.out.println("one row created....");
			
			System.out.println("want to continue(y/n)");
			ans=sc.next();
						
		}while(ans.equals("y"));
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}

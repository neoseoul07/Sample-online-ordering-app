package foodonlineordering;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
public class Order {
	
	int ord_id;
	int cust_id;
	Date date;
	String status;
	
	public void makeOrder()
	{
		
	}
	
	public void printOrder()
	{
		
	}
	public static ArrayList<Order> getArrayListFromResultSet(ResultSet rs) throws NumberFormatException, SQLException
	{
		ArrayList<Order> ar = new ArrayList<Order>();
		Order o;
		while(rs.next())
		{
			o = new Order();
			o.ord_id = rs.getInt(0);
			o.date = rs.getDate(1);
			o.status = rs.getString(2);
			o.cust_id = rs.getInt(3);
			ar.add(o);
		}
		return ar;
	}

}

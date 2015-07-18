package foodonlineordering;
import java.sql.SQLException;
import java.util.*;

public class User { 
	
	String name;
	int user_id;
	String cell_no;
	String street;
	String city;
	String state;
	int pin;
	
	public ArrayList<Order> myOrders() throws NumberFormatException, SQLException
	{
		DBOperation db1=new DBOperation();
		return Order.getArrayListFromResultSet(db1.select("select * from Order where cust_id = this.user_id"));
	}
	
	
}


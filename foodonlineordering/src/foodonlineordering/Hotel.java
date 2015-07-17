package foodonlineordering;

import java.util.ArrayList;

public class Hotel {
	
	int h_id;
	String name;
	ArrayList<Item> menu=new ArrayList<>();
	String city;
	int pin;
	
	public void printMenu()
	{
 		System.out.println("Items Menu is  :  ");
 		for(Item x : menu)
 		{
 			
 		}
	}
	
}

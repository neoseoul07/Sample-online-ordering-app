package foodonlineordering;

public abstract class User { 
	
	String name;
	int user_id;
	String cell_no;
	String street;
	String city;
	String state;
	int pin;
	
	public abstract void login();

	public abstract void logout();

	
	
}


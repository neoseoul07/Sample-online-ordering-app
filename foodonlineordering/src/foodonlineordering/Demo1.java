package foodonlineordering;

public class Demo1 {

	public static void main(String[] args) {
		DBOperation db1=new DBOperation();
		db1.select("Employee");
		
		
		
		System.out.println("****************");
		
		db1.insert();
		System.out.println("*******************");

	}

}

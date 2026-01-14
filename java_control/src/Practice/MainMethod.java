package Practice;

public class MainMethod {

	public static void main(String[] args) {
		   DBConnect connect = new DBConnect();
		   
		   Item[] items =connect.itemList();
		   
		   System.out.println(items[3]);
		   
		   

	}

}

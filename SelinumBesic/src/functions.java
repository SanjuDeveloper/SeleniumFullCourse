
public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functions obj = new functions();
		obj.Print();
		
		String name = GetData();  // call without object becaues it is static method
		System.out.println(name);
		
		// Creating object of another class
		AllFunctions object = new AllFunctions();
		object.GetUserData();
		
		
	}
	
	public void Print()
	{
		System.out.println("Hello Selenium");
	}
	
	public static String  GetData()
	{
		// Can call a static method without creating object of the class
		return "Sanju";
	}

}

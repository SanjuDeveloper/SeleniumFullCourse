
public class Strings {

	public static void main(String[] args) {
		//  In java String is an object
		String s = "Selenium"; //Literal way to define string
		
		String s1 = new String("Selenium"); // Using new keyword
		s.charAt(0); // Will Print 0 index of the string
		
		String str = "Rahul Setty Acadmy";
		String[] splittedString = str.split("Setty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);		
		System.out.println(splittedString[1].trim());
		
		 // Reverse  String
		
		for(int i= str.length()-1; i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		

	}

}

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,122};
		for(int i =0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//= ============= ARRAYLIST ==============
		
		ArrayList<String>  obj = new ArrayList<String>();
		obj.add("Sanju");  // Insert value in a array
		obj.add("Abhay");
		obj.add("Naresh");
		obj.add("Raju");
		obj.remove(3);
		System.out.print(obj.get(1));
	}

}

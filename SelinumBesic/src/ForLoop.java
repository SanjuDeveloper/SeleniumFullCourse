
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,122};
		for(int i =0; i<array.length;i++)
		{
			if(array[i] % 2 == 0){
				
				System.out.println(array[i] +"Is a Even number");
				break;  // Bresk will Exit the program from here
			}
			else {
				System.out.println(array[i]+ " Is a odd number");
			}
		}
		
		
	}

}


public class NestedLoop {
	
	//nested loops works -
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//nested loops works -
		int k=1;
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		//System.out.println( "outer loop started");
		for(int j=1;j<=4-i;j++) // inner loop
		{
		System.out.print( k);
		System.out.print("\t");
		k++;
		}
		//System.out.println( "");
		}
	}
	
	// Example on pyramid Triangle
	public void p() {
		// TODO Auto-generated method stub
		//int k=1;
		for(int i=1;i<5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		System.out.print("\t");
		//k++;
		}
		System.out.println("");

		}
	/* OUTPUT:
	 *  
		*
		**
		***
		****
		*****
	*/
		

	}

}

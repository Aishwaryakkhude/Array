
public class Returning_Array_from_Method_3 {

	 static int[] get() {
   	 
		return new int[]{10,20,30};
    }
	public static void main(String[] args) {

    //calling method which returns an array 
		int array[]=get();
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		

	}

	
}

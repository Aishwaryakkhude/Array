
public class Passing_Array_to_Method_2 {
	
	static void method(int array[]) {
		int method=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
			
			if(method>array[i])
			{
				method=array[i];
				//System.out.print(" "+method);
			}
			
		}
		System.out.print("\n Min number "+method+"\n");
		
	}

	public static void main(String[] args) {

		int array[]= {33,5,2,1};
		method(array);
		System.out.print("Anonymous Array :");
		method(new int[]{10,20,30});//Anonymous array not need to declared array 
									//while passing to method
	}

}

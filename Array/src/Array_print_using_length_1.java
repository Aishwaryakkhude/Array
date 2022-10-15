
public class Array_print_using_length_1 {

	public static void main(String[] args) {


		int d[]=new int[5];
		System.out.print(" allowcation of memory d[1]="+d[1]+"\n");//0
		
		int e[]=new int['a'];
		System.out.print(" Stored value in int e[1]="+e.length+"\n");//97
		
		int f[]=new int[(int)11.45];
		System.out.println(f.length);//11
		
		int g[]=new int[(int)11.45f];
		System.out.println(g.length);//11
		
		//int z[]=new int[2147483647];
		//System.out.println(z.length);//runtime 
		
		int a[]=new int[2];
		a[0]=1;
		a[1]=2;
		//a[2]=3;//Index 2 out of bounds for length 2
		
		System.out.println("For each loop");
		for(int x:a)
		{
			System.out.print(" "+x);
		}
		
		int b[]= {10,20,30};//declaration, instantiation and initialization  
		System.out.println("\nUsing  length :");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}

	}

}

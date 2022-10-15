
public class Multidimensional_4 {

	public static void main(String[] args) {


		int array[][]= {{10,20},{30,40},{10,20,30},{11,22}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("  "+array[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n Using length\n");

		
		for(int r=0;r<array.length;r++)
		{
			for(int c=0;c<array[r].length;c++)
			{
				System.out.print("  "+array[r][c]);
			}
			System.out.print("\n");
		}
		
		System.out.print("\n  array[0]="+array[0]);//[I@2626b418

		System.out.print("\n  array[0][0]="+array[0][0]);//10
	//	System.out.print("\n  array[0][0]="+array[0][0][0]);//10

	}

}

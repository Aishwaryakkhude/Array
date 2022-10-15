
public class Multidiamentional_5 {

	public static void main(String[] args) {


		
		int array[][][]= {
				   {{10,20,30}},
				   {{22,11,33},{14,12,13}},
						{{10,30,50}}
						};

		for(int r=0;r<array.length;r++)
		{
			for(int c=0;c<array[r].length;c++)
			{
				
				for(int i=0;i<array[r][c].length;i++)
				{
					System.out.print("  "+array[r][c][i]);
					
				}
				
			}
			System.out.print("\n");
		}
	}

}

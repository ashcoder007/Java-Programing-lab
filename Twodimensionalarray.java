public class Twodimensionalarray
{
	public static void main(String[] args)
	{
	    int[][]a= {{1,2},{3,4},{5,6}};
	    
		System.out.println("Two dimensional array elements are");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<2;j++)
		    {
		        System.out.print(a[i][j]);
		    }
		    System.out.println();
		}
		
	}
}

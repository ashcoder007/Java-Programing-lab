//wap to create a integer array calculate the sum and average using for each loop
public class array3
{
	public static void main(String[] args)
	{
	    int num[] = new int[]{10,9,6,5,4,3,2,1};
	    int sum =0;
	   double avg= 0;
	 
	    for(int a:num)
	    {
	        sum = sum+a;
	    }
	       System.out.println(sum);
	       avg=(double)sum/(double)num.length;
	          System.out.println(avg);
	          
	    
	}
}

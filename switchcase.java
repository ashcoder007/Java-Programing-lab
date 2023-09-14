import java.util.Scanner;    
public class switchcase
 {
 	public static void main(String[] args) 
 	{
 	    String name="Ashish Kumar";
 	   System.out.println(name);
 	    Scanner sc=new Scanner(System.in);
 	     System.out.println("enter the choice 1/2");
 	     int choice=sc.nextInt();
 	    switch(choice)
 	    {
 	        case 1:
 	            
 	            System.out.println(name.toLowerCase());
 	            break;
 	        case 2:
 	            System.out.println(name.toUpperCase());
 	            break;
 	            default:
 	            System.out.println("no case");
 	            break;
 	    }
 	}}
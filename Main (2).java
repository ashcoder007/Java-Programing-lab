/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main extends Thread
{
    public void run()
    {
        System.out.println("welcome to csit");
    }
	public static void main(String[] args) 
	{
	    Main t1 = new Main();
	    Main t2 = new Main();
	    Main t3 = new Main();
	    t1.start();
	    t2.start();
	    t3.start();
	    
	
	}
}

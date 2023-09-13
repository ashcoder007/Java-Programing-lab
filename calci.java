/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A {
    private int i;
    private int j;
    A(int x,int y)
    {
        i=x;
        j=y;
    }
    public void add()
    {
        System.out.println(i+j);
    }
    public void sub()
    {
        System.out.println(i-j);
    }
    public void mul()
    {
        System.out.println(i*j);
    }
    public void div()
    {
     System.out.println(i/j);   
    }
}
 public class calci
 {
    public static void main(String[] args) 
    {
        A c = new A(3,4);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
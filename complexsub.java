 class Complex{
    int real;
    int imag;
    Complex(int real,int imag)
    {
        this.real=real;
        this.imag=imag;
    }
    public static Complex subs(Complex x,Complex y)
    {
        return new Complex(x.real-y.real,x.imag-y.imag);
    }
}
class complexsub{
    public static void main(String args[])
    {
        Complex x=new Complex(3,4);
        Complex y=new Complex(2,3);
        Complex z=Complex.subs(x,y);
        System.out.println(z.real+"+"+z.imag+"i");
    }
}

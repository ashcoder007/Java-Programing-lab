final class Finalclass
{
  public void display ()
  {
    System.out.println ("this is finbal method.");

  }
}
class main3 extends Finalclass
{
  public void display ()
  {
    System.out.println ("the final method is overridden.");

  }
  public static void main (String[]args)
  {
    main3 obj = new main3();
    obj.display ();
  }
}
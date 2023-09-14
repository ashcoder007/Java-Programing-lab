class Box
{
  private double length;
  private double breadth;
  private double height;

  public void setDimensions (double length, double breadth, double height)
  {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  public String getDimensions ()
  {
    return "Length: " + length + " Breadth: " + breadth + " Height: " +
      height;
  }
}
public class boxdimension
{
  public static void main (String[]args)
  {
    Box myBox = new Box ();
      myBox.setDimensions (10.0, 5.0, 3.0);
    String dimensions = myBox.getDimensions ();
      System.out.println ("Box dimensions: " + dimensions);
  }
}

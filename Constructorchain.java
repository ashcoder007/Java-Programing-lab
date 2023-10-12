public class Constructorchain
{
    Constructorchain()
        {
         this("Hello");
         System.out.println("default constructor called.");
         
        }
        Constructorchain(String str)
        {
            System.out.println("Prarmeterized constructor called");
            
        }
        public static void main(String args[])
        {
            Constructorchain cc = new Constructorchain();
        }
}
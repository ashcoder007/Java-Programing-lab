public class Mainthreadinterface implements Runnable
{
    public static void main(String[] args)
    {
        Mainthreadinterface obj = new Mainthreadinterface();
        Thread thread = new Thread(obj);
        thread.start();
           System.out.println("this code is outside of the thread");
    }
    public void run()
    {
        System.out.println("this code is running in a thread");
    }
}
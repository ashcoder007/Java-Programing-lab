public class MainThread extends Thread{
  
    public static void main(String[] args)
    {
        MainThread t1 = new MainThread();
        t1.start();
        System.out.println("this code is outside of the thread");
    }
    public void run()
    {
        System.out.println("this code is running in a thread");
    }
}
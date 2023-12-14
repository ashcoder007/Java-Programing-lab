class ThreadCount extends Thread {

  ThreadCount(String name) {
    super(name);
    System.out.println("New thread created: " + getName());
  }
  
  public void run() {
    try { 
      for(int i = 0; i < 10; i++) {
        System.out.println("Executing " + getName());
        Thread.sleep(1500);
      }
    } catch (InterruptedException e) {
      System.out.println(getName() + " interrupted");
    }
    System.out.println(getName() + " finished execution");
  }
  
}

public class Main {

  public static void main(String[] args) {
    ThreadCount t1 = new ThreadCount("Thread 1");
    t1.start();
  }

}
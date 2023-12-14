class Banking {
    static String Accno = "12345678";
    static int amt = 100000;

    public void withdraw(int n2) 
    {
        if (n2 < amt)
        {
            int amount1 = amt - n2;
            System.out.println("Withdrawal amount: " + amount1);
        }
    }

    public void deposit(int n4)
    {
        if (n4 > amt) 
        {
            int amount2 = amt + n4;
            System.out.println("Deposited amount: " + amount2);
        }
    }
}

class Thread1 extends Thread 
{
    public void run() 
    {
        Banking b = new Banking();
        b.withdraw(99999);
    }
}

class Thread2 extends Thread {
    public void run() {
        Banking d = new Banking();
        d.deposit(100001);
    }
}

public class bankingbyjava {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}


public class staticmethod{ 
    static int x;
    staticmethod(int i)
    { 
        x=i;
    }
    public static void get()
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        staticmethod obj=new staticmethod(100);
        staticmethod.get();
    }
}


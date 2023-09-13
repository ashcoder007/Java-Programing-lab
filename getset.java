public class getset{ 
    static int x;
    getset(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        getset obj=new getset(100);
        getset.get();
    }
}

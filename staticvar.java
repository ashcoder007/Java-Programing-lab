public class staticvar{ 
    static int x;
    staticvar(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        staticvar obj=new staticvar(100);
        staticvar.get();
    }
}

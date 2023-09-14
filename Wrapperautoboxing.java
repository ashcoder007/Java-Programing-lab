//Declare the primitive data type with some initial value.Convert this primitive data type to using wrapper class.
public class Wrapperautoboxing{
    public static void main(String args[]){
        int i=10;
        boolean b=true||false;
        char c='a';
        byte e=1;
        short s=8;
        long l=100;
        float f=3.14f;
        double d=200;
        System.out.println(i+" "+b+" "+c+" "+e+" "+s+" "+l+" "+f+" "+d);
        Integer I=i;
        Boolean B=b;
        char C=c;
        Byte E=e;
        Short S=s;
        Long L=l;
        Float F=f;
        Double D=d;
        System.out.println(I+" "+B+" "+C+" "+E+" "+S+" "+L+" "+F+" "+D);
    }
}
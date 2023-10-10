class Parent
{
    void display()
    {
        System.out.println("This is the parent class");
    }
    void show(int num){
        System.out.println("the number in the parent class is:"+num);
        
    }
}
class Child extends Parent 
{
    void display(){
        System.out.println("this is the child class");
    }
    void show(double num){
        System.out.println("the number in the child class is:"+num);
    }
}
public class Main4{
    public static void main(String[] args){
        Parent parentObj = new Parent();
        Child childObj = new Child();
        parentObj.show(5);
        childObj.show(7.5);
        parentObj.display();
        childObj.display();
    }
}

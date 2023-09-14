class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        System.out.println("Person object: " + person);

        String personString = person.toString();
        System.out.println("Person object (explicit toString()): " + personString);
    }
}

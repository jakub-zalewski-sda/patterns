package playground2.other.polymorphism;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("i am person " + name);
    }
}

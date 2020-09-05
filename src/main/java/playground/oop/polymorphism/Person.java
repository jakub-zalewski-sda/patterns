package playground.oop.polymorphism;

public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHallo() {
        System.out.println("i am person: " + name);
    }
}

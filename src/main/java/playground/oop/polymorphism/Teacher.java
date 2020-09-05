package playground.oop.polymorphism;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void sayHallo() {
        System.out.println("i am teacher: " + name);
    }
}

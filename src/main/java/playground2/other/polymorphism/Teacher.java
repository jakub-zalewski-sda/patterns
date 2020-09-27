package playground2.other.polymorphism;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("i am teacher " + name);
    }
}

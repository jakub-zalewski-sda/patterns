package playground.oop.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person("stachu");
        Person person2 = new Teacher("roman");

        person.sayHello();
        person2.sayHello();
    }
}

package playground;

import playground.oop.polymorphism.Person;
import playground.oop.polymorphism.Teacher;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person("stachu");
        person.sayHallo();

        Person personTeacher = new Teacher("anna");
        personTeacher.sayHallo();
    }
}

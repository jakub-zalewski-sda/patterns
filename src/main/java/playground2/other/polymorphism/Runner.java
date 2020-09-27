package playground2.other.polymorphism;

public class Runner {

    public static void main(String[] args) {
        Person person = createRegularPerson();
        person.sayHello();

        Person person2 = createTeacher();
        person2.sayHello();

        Person person3 = new Person("stachu3");
        Person person4 = new Person("stachu4");
        Person person5 = new Person("stachu5");
    }

    private static Person createRegularPerson() {
        return new Person("stachu");
    }

    private static Teacher createTeacher() {
        return new Teacher("ania");
    }
}

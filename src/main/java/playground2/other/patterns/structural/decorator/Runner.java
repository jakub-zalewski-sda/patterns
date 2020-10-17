package playground2.other.patterns.structural.decorator;

public class Runner {

    public static void main(String[] args) {
        Pizza salami = new Ham(new Mushrooms(new Ham(new Cheese(new Salami()))));


        System.out.println(salami.getPrice());
        System.out.println(salami.getName());


    }
}

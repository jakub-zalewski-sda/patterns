package playground2.other.patterns.structural.composite;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Unit unit1 = new Soldier();
        Unit unit2 = new Dog();

        Unit army = new Army(Arrays.asList(unit1, unit2));
//
//        System.out.println(unit1.getPower());
//        System.out.println(unit2.getPower());

        System.out.println(army.getPower());
    }

}



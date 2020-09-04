package structural.composite;

public class SingleUnit implements Unit {

    private final String name;
    private final int power;

    public SingleUnit(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public int getPower() {
        System.out.println(name + ", power: " + power);
        return power;
    }
}

package structural.decorator;

public class Coffee implements Drink {

    @Override
    public String description() {
        return "coffee";
    }

    @Override
    public float price() {
        return 5f;
    }
}

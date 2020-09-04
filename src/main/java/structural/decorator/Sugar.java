package structural.decorator;

public class Sugar extends Addition {

    public Sugar(Drink drink) {
        super(drink, "sugar", 0.5f);
    }
}

package playground2.other.patterns.structural.decorator;

public class Ham extends Addition {

    public Ham(Pizza pizza) {
        super(pizza, "ham", 4);
    }
}

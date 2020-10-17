package playground2.other.patterns.structural.composite;

import java.util.List;

public class Army implements Unit {

    private List<Unit> elements;

    public Army(List<Unit> elements) {
        this.elements = elements;
    }

    @Override
    public int getPower() {
        return elements.stream()
            .map(Unit::getPower)
            .reduce(0, Integer::sum);
    }
}

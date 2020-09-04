package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UnitComposite implements Unit {

    private final List<Unit> units;

    public UnitComposite() {
        units = new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    @Override
    public int getPower() {
        return units.stream()
            .map(Unit::getPower)
            .reduce(0, Integer::sum);
    }
}

package structural.composite;

public class UnitFactory {

    public Unit createSoldier() {
        return new SingleUnit("soldier", 5);
    }

    public Unit createArmy() {
        SingleUnit soldier = new SingleUnit("soldier", 5);
        SingleUnit tank = new SingleUnit("tank", 25);
        UnitComposite army = new UnitComposite();
        army.addUnit(soldier);
        army.addUnit(tank);

        return army;
    }
}

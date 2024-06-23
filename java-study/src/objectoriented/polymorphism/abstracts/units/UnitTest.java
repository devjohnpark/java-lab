package objectoriented.polymorphism.abstracts.units;

public class UnitTest {
    public static void main(String[] args) {
        Unit[] units = new Unit[3];
        units[0] = new Dropship();
        units[1] = new Marine();
        units[2] = new Tank();

        for (Unit unit : units) {
            unit.move(100, 100);
        }
    }
}

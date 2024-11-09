package objectoriented.polymorphism.interfaces.unit;

import objectoriented.polymorphism.interfaces.fighter.Repairable;

public class SCV extends GroundUnit implements Repairable {
    public SCV(int x, int y, int hp) {
        super(x, y, hp);
    }

    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            final int UNIT_MAX_HP = u.getMAX_HP();
            int unitCurrentHP = u.getHP();
            while(unitCurrentHP < UNIT_MAX_HP) {
                u.setHP(++unitCurrentHP);
            }
            System.out.println("The repairs are complete.");
        }
    }
}

package objectoriented.polymorphism.interfaces.unit;

import objectoriented.polymorphism.interfaces.fighter.Fightable;
import objectoriented.polymorphism.interfaces.fighter.Repairable;

class Marine extends GroundUnit implements Fightable {

    public Marine(int x, int y, int hp) {
        super(x, y, hp);
    }

    void stimPack() {
    }

    @Override
    public void fight(Fightable target, int x, int y) {

    }

    @Override
    public void attack(Unit targetUnit) {
        int targetUnitHP = targetUnit.getHP();
        if(targetUnitHP > 0) {
            targetUnitHP = targetUnitHP > 10 ? targetUnitHP - 10 : 0;
            targetUnit.setHP(targetUnitHP);
        } else {
            System.out.println("The unit is already deaded.");
        }
    }

    @Override
    public void move(int x, int y) {

    }
}

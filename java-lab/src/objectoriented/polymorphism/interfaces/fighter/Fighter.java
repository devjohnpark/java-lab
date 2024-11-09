package objectoriented.polymorphism.interfaces.fighter;

import objectoriented.polymorphism.interfaces.unit.Unit;

class Fighter extends Unit implements Fightable {

    public Fighter(int x, int y, int hp) {
        super(x, y, hp);
    }

    @Override
    // 상대방이 싸울수 있는 상태여야 싸움이 가능하다.
    public void fight(Fightable target, int x, int y) {
        if (target instanceof Unit unit) {
            move(x, y);
            attack(unit);
        } else {
            System.out.println("Invalid target.");
        }
    }
    // 구현할때는 public으로 지정하여 구현해야한다.
    // 구현한 메서드는 실제로는 public abstract로 지정되어 있기 때문이다.
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
        setXY(x, y);
    }
}

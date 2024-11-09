package objectoriented.polymorphism.interfaces.fighter;


import objectoriented.polymorphism.interfaces.unit.Unit;

public interface Fightable extends Movable, Attackable {
    void fight(Fightable target, int x, int y);

}

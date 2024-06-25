package objectoriented.polymorphism.interfaces.unit;

import objectoriented.polymorphism.interfaces.fighter.Fightable;

public abstract class Unit {
    private int x, y;
    private int hp;

    public Unit(int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
    }

    public int getHP() { return hp; }

    public void setHP(int hp) {
        if (hp < this.hp) {
            System.out.println("HP decreased by " + (this.hp - hp) + " points.");
        }
        this.hp = hp;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


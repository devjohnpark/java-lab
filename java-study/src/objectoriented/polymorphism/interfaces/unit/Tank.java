package objectoriented.polymorphism.interfaces.unit;

import objectoriented.polymorphism.interfaces.fighter.Repairable;

class Tank extends GroundUnit implements Repairable {
    public Tank(int x, int y, int hp) {
        super(x, y, hp);
    }

    void changeMode() {

    }
}

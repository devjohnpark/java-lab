package objectoriented.polymorphism.interfaces.unit;

import objectoriented.polymorphism.interfaces.fighter.Repairable;

class Dropship extends AirUnit implements Repairable {
    public Dropship(int x, int y, int hp) {
        super(x, y, hp);
    }

    void load() {
    }

    void unload() {
    }

}

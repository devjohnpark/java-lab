package objectoriented.polymorphism.abstracts.units;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    abstract void stop();
}

class Marine extends Unit {

    @Override
    void move(int x, int y) {

    }

    @Override
    void stop() {

    }

    void stimPack() {}
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {

    }

    @Override
    void stop() {

    }

    void changeMode() {}
}

class Dropship extends Unit {

    @Override
    void move(int x, int y) {

    }

    @Override
    void stop() {

    }

    void load() { }
    void unload() { }
}
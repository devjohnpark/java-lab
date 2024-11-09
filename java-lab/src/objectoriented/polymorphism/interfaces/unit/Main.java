package objectoriented.polymorphism.interfaces.unit;

public class Main {
    public static void main(String[] args) {
        SCV scv = new SCV(0,0, 100);
        Dropship dropship = new Dropship(0,0,1000);
        Marine marine = new Marine(0,0,500);
        marine.attack(dropship);
        scv.repair(dropship);
    }
}

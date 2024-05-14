package objectoriented;

public class Car {
    // member variables
    private final Manufacturer manufacturer;
    private Engine engine;
    private Wheel[] wheels;

    public Car(Manufacturer manufacturer, Engine engine, Wheel[] wheels) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.wheels = wheels;
    }

    // methods
    public Wheel[] getWheels() {
        return wheels;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Engine Type: " + engine.getEngineType());
    }

    public void replaceOneWheel(int index, Wheel newWheel) {
        if (isValidIndex(index)) {
            if (isSameRadius(index, newWheel)) {
                wheels[index] = newWheel;
            } else {
                System.out.println("The radius of the new wheel does not match the radius of other wheels.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public boolean isValidIndex(int index) {
        return index >= 0 && index < wheels.length;
    }

    public boolean isSameRadius(int index, Wheel newWheel) {
        return wheels[index].getWheelRadius() == newWheel.getWheelRadius();
    }
}
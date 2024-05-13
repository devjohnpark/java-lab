package objectOrientedProgramming;

public class Car {
    // member variables
    static double maxEmission = 4.6;
    S engine;
    Wheel[] wheels;

//    // constructor
//    public Car(String engine, Wheel[] wheels) {
//        this.engine = engine;
//        this.wheels = wheels;
//    }

    // methods
    Wheel[] getWheels() {
        return wheels;
    }

    void printInfo() {
        System.out.println("Car Engine: " + engine);
        System.out.printf("Wheels Tire %s and Radius %f \n", wheels[0].getWheelTire(), wheels[0].getWheelRadius());
    }

    void replaceOneWheel(int index, Wheel newWheel) {
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

    boolean isValidIndex(int index) {
        return index >= 0 && index < wheels.length;
    }

    boolean isSameRadius(int index, Wheel newWheel) {
        return wheels[index].getWheelRadius() == newWheel.getWheelRadius();
    }
}
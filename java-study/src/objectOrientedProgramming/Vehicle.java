package objectOrientedProgramming;

public class Vehicle {
    private final String vehicleType;
    private Wheel[] wheels;

    public Vehicle(String vehicleType, Wheel[] wheels) {
        this.vehicleType = vehicleType;
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void printInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.printf("Wheels Tire %s and Radius %f \n", wheels[0].getWheelTire(), wheels[0].getWheelRadius());
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

    private boolean isValidIndex(int index) {
        return index >= 0 && index < wheels.length;
    }

    private boolean isSameRadius(int index, Wheel newWheel) {
        return wheels[index].getWheelRadius() == newWheel.getWheelRadius();
    }
}
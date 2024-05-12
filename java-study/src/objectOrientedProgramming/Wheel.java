package objectOrientedProgramming;

public class Wheel {
    private final double radius;
    private Tire tire;

    // constructor
    public Wheel(double radius, Tire tire) {
        this.radius = radius;
        this.tire = tire;
    }

    // 반지름 getter 메서드
    public double getWheelRadius() {
        return radius;
    }

    // 타이어 getter 메서드
    public Tire getWheelTire() {
        return tire;
    }

    // 타이어 변경 setter 메서드
    public void changeTire(Tire newTire) {
        this.tire = newTire;
    }
}

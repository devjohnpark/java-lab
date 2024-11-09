package objectoriented.modifier;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        time.setHour(5);
        time.setMinute(5);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
    }
}

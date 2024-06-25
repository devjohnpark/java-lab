package objectoriented.polymorphism.interfaces.multipleinheritance;

public class VCR {
    protected int counter;

    public void play() {
        System.out.println("TAPE 재생");
    }
    public void stop() {
        System.out.println("TAPE 재생 멈춤");
    }
    public void reset() {
        counter = 0;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
}

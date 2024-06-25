package objectoriented.polymorphism.interfaces.multipleinheritance;

public class TVCR extends Tv implements IVCR {
    VCR vcr = new VCR();

    @Override
    public void play() {
        vcr.play();
    }

    @Override
    public void stop() {
        vcr.stop();
    }

    @Override
    public void reset() {
        vcr.reset();
    }

    @Override
    public int getCounter() {
        return 0;
    }

    @Override
    public void setCounter(int counter) {
        vcr.setCounter(counter);
    }
}

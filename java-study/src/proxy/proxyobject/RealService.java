package proxy.proxyobject;

public class RealService implements Service {
    @Override
    public void performOperation() {
        System.out.println("RealService: 실제 작업 수행");
    }
}


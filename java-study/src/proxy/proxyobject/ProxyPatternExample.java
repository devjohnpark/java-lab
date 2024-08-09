package proxy.proxyobject;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Service service = ServiceProxy.createProxy();

        // 프록시 객체를 통해 실제 객체에 접근
        service.performOperation();
    }
}


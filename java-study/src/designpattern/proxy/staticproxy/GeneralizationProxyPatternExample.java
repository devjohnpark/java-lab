package designpattern.proxy.staticproxy;

// Subject: 프록시와 실제 객체가 구현해야 하는 공통 인터페이스
interface Subject {
    void request();
}

// RealSubject: 프록시가 대리하는 실제 객체
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// Proxy: 실제 객체에 대한 대리자
class Proxy implements Subject {
    private RealSubject realSubject;

    public void preAction() {
        System.out.println("Proxy: Additional logic before delegating to RealSubject.");
    }

    public void postAction() {
        System.out.println("Proxy: Additional logic after delegating to RealSubject.");
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject(); // 실제 객체를 지연 초기화
        }
        preAction();
        realSubject.request(); // 실제 객체에 요청 위임
        postAction();
    }
}

// 클라이언트 코드
public class GeneralizationProxyPatternExample {
    public static void main(String[] args) {
        // 클라이언트는 Proxy를 통해 RealSubject에 접근
        Subject proxy = new Proxy();
        proxy.request();
    }
}

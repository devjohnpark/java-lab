package designpattern.decorator;

// 데코레이터의 하위 클래스이며 기능을 추가(데코레이션)하는 클래스 -> 메세지 암호화 기능 추가
public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(message.getContent()); // 암호화된 메시지 반환
    }

    // 런타임에 객체에 암호화 기능 추가
    private String encrypt(String content) {
        // 간단한 암호화 시뮬레이션 (실제로는 더 복잡한 암호화 알고리즘 사용)
        return new StringBuilder(content).reverse().toString();
    }
}

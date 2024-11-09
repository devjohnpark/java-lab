package designpattern.decorator;

// 데코레이터의 하위 클래스이며 기능을 추가(데코레이션)하는 클래스 -> 메세지 압축 기능 추가
public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compress(message.getContent());
    }

    // 런타임에 객체에 압축 기능 추가
    private String compress(String content) {
        // 간단한 압축 예시: 모든 공백을 제거하여 압축
        return content.replaceAll("\\s+", "");
    }
}

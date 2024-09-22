package designpattern.decorator;

// 기존 클래스
// 여러 인터페이스를 (다중) 상속하는 기존 클래스
public class SimpleMessage implements Message {
    private String content;

    public SimpleMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

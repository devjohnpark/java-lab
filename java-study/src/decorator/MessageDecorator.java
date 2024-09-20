package decorator;

public class MessageDecorator implements Message {
    protected Message message; // 데코레이터가 감쌀 메시지 객체

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent(); // 기본 메시지 내용을 반환
    }
}


package designpattern.decorator;

// 인터페이스들을 구현한 객체를 감싸는 데코레이터 클래스 -> 런타임에 필요에 따라 객체에 기능 추가 가능
// 기존 클래스(MessageDecorator)에 추가 기능을 '데코레이션(Decoration)' 할수 있도록 추상 클래스로 작성
public abstract class MessageDecorator implements Message {
    protected Message message; // 데코레이터가 감쌀 메시지 객체

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent(); // 기본 메시지 내용을 반환
    }
}


package designpattern.decorator;

public class Client {
    public static void main(String[] args) {
        Message message = new SimpleMessage("Hello, World!");
        System.out.println("Original Message: " + message.getContent());

        // 데코레이터를 사용하여 메시지에 암호화 기능 추가
        Message encryptedMessage = new EncryptedMessage(message);
        System.out.println("Encrypted Message: " + encryptedMessage.getContent());

        // 데코레이터를 사용하여 메시지에 암축 기능 추가
        Message compressMessage = new CompressedMessage(message);
        System.out.println("Compressed Message: " + compressMessage.getContent());
    }
}

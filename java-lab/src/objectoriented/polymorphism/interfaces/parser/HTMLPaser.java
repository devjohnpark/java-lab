package objectoriented.polymorphism.interfaces.parser;

public class HTMLPaser implements Parserable {
    @Override
    public void parse(String fileName) {
        // 구문 분석 작업을 수행하는 코드
        System.out.println(fileName + "- HTML parsing completed.");
    }
}

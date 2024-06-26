package objectoriented.polymorphism.interfaces.parser;

public class PaserTest {
    public static void main(String[] args) {
        Parserable parser = ParserManager.getParser("XML");
        parser.parse("doc.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("doc.html");
    }
}

package objectoriented.polymorphism.interfaces.parser;

public class ParserManager {
    public static Parserable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLPaser();
        }
    }
}

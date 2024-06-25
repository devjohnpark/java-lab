package objectoriented.polymorphism.interfaces.Parser;

public class ParserManager {
    public static Parserable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLPaser();
        }
    }
}

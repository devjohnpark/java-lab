package objectoriented.polymorphism.interfaces.relation;



public class InstanceManager {
    public static IProvider getService(String type) {
        if (type.equalsIgnoreCase("provider")) {
            return new Provider();
        }
//         else if (type.equalsIgnoreCase("anotherProvider")) {
//             return new AnotherProvider();
//         }
        throw new IllegalArgumentException("Unknown service type: " + type);
    }
}

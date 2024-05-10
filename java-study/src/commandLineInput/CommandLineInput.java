package commandLineInput;

public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a command line argument");
        } else {
            for (String tmp : args) {
                System.out.println(tmp);
            }
        }
    }
}

package objectoriented.method;

public class VarArgs {

    // var argument
    int addValues(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

//    // overloading
//    // java: reference to addValues is ambiguous
//    int addValues(int num, int... values) {
//        for (int i = 0; i < values.length; i++) {
//            num += values[i];
//        }
//        return num;
//    }

//    // array argument
//    int addValues(int values[]) {
//        int sum = 0;
//        for (int i = 0; i < values.length; i++) {
//            sum += values[i];
//        }
//        return sum;
//    }

    void varArgs(String...str) {
        System.out.println(str.length);
    }

    public static void main(String[] args) {
        String[] str = {"abc", "def", "hig"};
        VarArgs varArgs = new VarArgs();
        varArgs.varArgs(str);

        System.out.println(varArgs.addValues(new int[] {1, 2, 3}));

        int value = 10;
        System.out.println(varArgs.addValues(value));

        int[] values = {1, 2, 3, 4, 5};
        System.out.println(varArgs.addValues(values));

        System.out.println(varArgs.addValues());
    }
}

package exceptionhandle.checkunchecked;

public class Unchecked {
    public static void main(String[] args) {
        try {
//            int[] arr = new int[5];
//            System.out.println(arr[6]);
            int[] arr = null;
            System.out.println(arr[0]); // NullPointerException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

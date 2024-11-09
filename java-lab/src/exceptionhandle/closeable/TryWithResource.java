package exceptionhandle.closeable;

import java.io.Closeable;

public class TryWithResource {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) { // 예외 처리 됨
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException e) { // 예외 처리 됨
            e.printStackTrace();
//            Throwable[] ce = e.getSuppressed();
//            for (Throwable throwable : ce) {
//                throwable.printStackTrace();
//            }
        } catch (CloseException e) { // 예외 처리 됨
            e.printStackTrace();
        }
    }
}

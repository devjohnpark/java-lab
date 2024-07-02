package exceptionhandle.trynonexception;


class TryNonExceptionHandleCheck {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (ArithmeticException e) {
            System.out.println("Main - Arithmetic Exception");
            e.printStackTrace();
        }

    }

    private static void generateException() throws ArithmeticException {
        try {
            int result = 1 / 0; // try블럭과 finally블럭 모두 예외 발생시, 예외 처리 무시 (예외 처리 객체 안던짐)
        } finally {
            try {
                System.out.println("generateException - finally - try - Arithmetic Exception");
                int result = 1 / 0;

            } catch (ArithmeticException e) {
                System.out.println("generateException - finally - catch - Arithmetic Exception");
            }
        }
    }

//    // 파일을 읽고 내용을 반환하는 메서드 (try-with-resources 사용)
//    private static String readFile(String fileName) throws IOException {
//        StringBuilder content = new StringBuilder();
//
//        // try-with-resources 구문을 사용하여 FileReader 자원을 자동으로 해제
//        try (FileReader reader = new FileReader(fileName)) { // FileNotFoundException이 발생할 수 있음
//            int character;
//            while ((character = reader.read()) != -1) { // IOException이 발생할 수 있음
//                content.append((char) character);
//            }
//        }
//
//        return content.toString();
//    }

}
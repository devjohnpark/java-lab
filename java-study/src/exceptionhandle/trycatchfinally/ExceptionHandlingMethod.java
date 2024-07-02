package exceptionhandle.trycatchfinally;

import java.io.File;

class ExceptionHandlingMethod {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        File file = new File(fileName);
        try {
            if (fileName==null||fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            fileName = "untitle.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {}
    }
}

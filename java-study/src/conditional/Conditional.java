package conditional;

import java.io.File;

public class Conditional {
    public static void main(String[] args) {
        int result = 10;
        String str = "hi";
//        float f = 0.1f;
        switch (str) {
            case "hid":
                System.out.println("5");
                break;
            case "hello":
                System.out.println("10");
            case "df":
                System.out.println("d");
//            case "dfdfd":
//                System.out.println("dfdfd");
            default:
                System.out.println("dafdsf");
        }

        int value = 3;

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3"); // Value is 3
                break;
            default:
                System.out.println("Value is not 1, 2, or 3");
                break;
        }


//        int score = 100;
//        switch (score / 10) {
//            case 10:
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("F");
//                break;
//        }
//
//        // 파일 경로 설정
//        String filePath = "/Users/junseopark/Documents/dev/backend/java";
//        File file = new File(filePath);
//
//        // 파일 읽기, 쓰기, 삭제 권한 부여
//        int permission = 7; // 7은 읽기, 쓰기, 삭제 권한을 나타냄
//
//        // 권한 설정
//        switch (permission) {
//            case 7:
//                file.setReadable(true);
//            case 6:
//                file.setWritable(true);
//            case 5:
//                file.setExecutable(true);
//                break; // break 생략하여 다음 case문도 수행되도록 함
//            default:
//                System.out.println("잘못된 권한 설정입니다.");
//        }
//
//        // 설정된 권한 확인
//        System.out.println("파일 읽기 권한: " + file.canRead());
//        System.out.println("파일 쓰기 권한: " + file.canWrite());
//        System.out.println("파일 삭제 권한: " + file.canExecute());

    }
}

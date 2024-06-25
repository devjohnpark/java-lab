package loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Java의 향상된 for문은 배열을 요소 값을 변수에 복사하여 저장한다. 따라서 배열의 요소를 직접 수정 불가능
        // 아래의 for문과 동일
        for (int tmp: arr) {
            System.out.println(tmp);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();


        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 이름 붙은 반복문
        outerLoop:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Element: " + array[i][j]);
                // 특정 조건에서 외부 반복문 종료
                if (array[i][j] == 5) {
                    System.out.println("Continue of outer loop");
                    continue outerLoop;
                }
                else if (array[i][j] == 7) {
                    System.out.println("Breaking out of outer loop");
                    break outerLoop;
                }
            }
        } // <- continue
        System.out.println("End of labeled break");
//        Element: 1
//        Element: 2
//        Element: 3
//        Element: 4
//        Element: 5
//        Continue of outer loop
//        Element: 7
//        Breaking out of outer loop
//        End of labeled break

    }
}

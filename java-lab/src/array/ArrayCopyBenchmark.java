package array;

import java.util.Arrays;

public class ArrayCopyBenchmark {
    public static void main(String[] args) {
        int[] originalArray = createArray(100000000); // 복사할 배열 생성 (100만 개의 요소) 100000000

        long startTime, endTime;

        // 1. for문 사용
        startTime = System.nanoTime();
        int[] copiedArray1 = copyArrayUsingForLoop(originalArray);
        endTime = System.nanoTime();
        System.out.println("Time taken using for loop: " + (endTime - startTime) + " ns");

        // 2. System.arraycopy() 메서드 사용
        startTime = System.nanoTime();
        int[] copiedArray2 = copyArrayUsingSystemArrayCopy(originalArray);
        endTime = System.nanoTime();
        System.out.println("Time taken using System.arraycopy(): " + (endTime - startTime) + " ns");

        // 3. Arrays.copyOfRange() 메서드 사용
        startTime = System.nanoTime();
        int[] copiedArray3 = copyArrayUsingArraysCopyOfRange(originalArray);
        endTime = System.nanoTime();
        System.out.println("Time taken using Arrays.copyOfRange(): " + (endTime - startTime) + " ns");
    }

    // 배열 생성 메서드
    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    // for문을 사용하여 배열 복사하는 메서드
    public static int[] copyArrayUsingForLoop(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    // System.arraycopy() 메서드를 사용하여 배열 복사하는 메서드
    public static int[] copyArrayUsingSystemArrayCopy(int[] original) {
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    // Arrays.copyOfRange() 메서드를 사용하여 배열 복사하는 메서드
    public static int[] copyArrayUsingArraysCopyOfRange(int[] original) {
        return Arrays.copyOfRange(original, 0, original.length);
    }
}
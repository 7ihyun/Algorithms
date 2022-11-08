package Level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CutArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5};

        System.out.println(CutArray.solution(arr1, 1, 3));
        System.out.println(CutArray.solution(arr2, 1, 2));
    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        // num1번째 인덱스부터 num2번째 인덱스까지 자른 배열
        return Arrays.copyOfRange(numbers, num1, num2 + 1);

//        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}

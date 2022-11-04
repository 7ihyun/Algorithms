package Level_0;

import java.util.Arrays;

public class Middle {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        Middle middle = new Middle();
        System.out.println("중앙값 : " + Middle.solution(array));
    }
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}

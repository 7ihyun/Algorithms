package Level_0;

import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        AverageOfArray averageOfArray = new AverageOfArray();

        System.out.println("평균 : " + AverageOfArray.solution(numbers1));
        System.out.println("평균 : " + AverageOfArray.solution(numbers2));

    }
    public static double solution(int[] numbers) {
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avg = (double)sum / numbers.length;
        return avg;

//        return Arrays.stream(numbers).average().orElse(0);
    }
}

package Level_1;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Average  average = new Average();

        System.out.println("평균 : " + average.solution(arr));
    }
    public double solution(int[] arr) {
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        double average = sum / arr.length;
        return average;
    }
}

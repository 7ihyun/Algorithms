package Level_0;

public class Double {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Double doubleTheArray = new Double();
        System.out.println("분수의 합 : " + Double.solution(numbers));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}

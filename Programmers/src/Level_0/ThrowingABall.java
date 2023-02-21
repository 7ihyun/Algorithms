package Level_0;

public class ThrowingABall {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println("공을 던지는 사람의 번호 : " + ThrowingABall.solution(numbers, 2));
    }
    public static int solution(int[] numbers, int k) {
        int answer = numbers[2 * (k -1) % numbers.length];
        return answer;
    }
}

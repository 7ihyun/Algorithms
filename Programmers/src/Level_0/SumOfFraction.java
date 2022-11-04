package Level_1;

public class SumOfFraction {
    public static void main(String[] args) {
        SumOfFraction sumOfFraction = new SumOfFraction();
        System.out.println("분수의 합 : " + SumOfFraction.solution(1, 2, 3, 4));
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        // A/B + C/D = (A*D + B*C) / B*D
        int[] answer = new int[2];

        int A = num1 * num2; // 분모
        int B = (denum1 * num2) + (denum2 * num1); // 분자
        int max = 1; // 최대공약수

        for (int i = 1; i <= A && i <= B; i++) {
            if (A % i == 0 && B % i == 0) max = i;
        }

        answer[0] = B / max;
        answer[1] = A / max;

        return answer;
    }
}

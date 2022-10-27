package Level_1;

public class SumOfDivisor {
    public static void main(String[] args) {
        int n = 12;
        SumOfDivisor sumOfDivisor = new SumOfDivisor();

        System.out.println("약수의 합 : " + SumOfDivisor.solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        int i = 0;
        // n의 제곱근까지 반복
        while (i <= Math.sqrt(n)) {
            // 약수인 경우
            if (n % i == 0) {
                answer += i;

                // 제곱근이 아닌 경우
                if (i != n/i) answer += n/i;
            }
            i++;
        }
        return answer;
    }
}

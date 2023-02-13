package Level_1;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println("각 자릿수의 합 : " + AddDigits.solution(123));
    }
    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

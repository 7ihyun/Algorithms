package Level_0;

public class MultipleOfN {
    public static void main(String[] args) {
        System.out.println("num이 n의 배수인지 : " + MultipleOfN.solution(98, 2));
    }
    public static int solution(int num, int n) {
//        int answer = 0;
        if (num % n == 0) return 1; // n의 배수이면 1
        else return 0;  // 아니면 0
    }
}

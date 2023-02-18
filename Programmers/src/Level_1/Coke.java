package Level_1;

public class Coke {
    public static void main(String[] args) {
        System.out.println("받을 수 있는 콜라 병의 수 : " + Coke.solution(2, 1, 20));
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (a <= n) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }

        return answer;
    }
}

// 다른 풀이
//        return (n - b) / (a - b) * b;
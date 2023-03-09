package Level_1;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println("두 정수 사이의 합 : " + SumOfTwoIntegers.solution(3, 5));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    // 다른 풀이
//    public static long solution(int a, int b) {
//        return sumAtoB(Math.min(a, b), Math.max(b, a));
//    }
//    private static long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;   // 등차수열 합 공식
//    }
}

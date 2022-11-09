package Level_0;

import java.util.stream.IntStream;

public class OrderPair {
    public static void main(String[] args) {
        System.out.println("순서쌍의 개수: " + OrderPair.solution(20));
        System.out.println("순서쌍의 개수: " + OrderPair.solution(100));
    }
    public static int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        answer = count;
        return answer;

//        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}

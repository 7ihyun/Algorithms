package Level_1;

public class Remainder {
    public static void main(String[] args) {
        System.out.println("나머지가 1인 수 : " + Remainder.solution(10));
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) return i;
        }
        return answer;

        // 다른 풀이
//        int answer = 1;
//        while(n % answer != 1){
//            answer++;
//        }
//        return answer;
    }
}

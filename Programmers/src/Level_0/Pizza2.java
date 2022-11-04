package Level_1;

public class Pizza2 {
    public static void main(String[] args) {
        Pizza2 pizza2 = new Pizza2();

        System.out.println("피자의 수 : " + Pizza2.solution(6));
        System.out.println("피자의 수 : " + Pizza2.solution(10));
        System.out.println("피자의 수 : " + Pizza2.solution(4));
    }
    public static int solution(int n) {
        // 피자 한 판은 6조각. n명이 피자를 남기지 않고 모두 같은 수의 조각을 먹어야 함
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i * 6 % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
//        int answer = 1;
//
//        while(true) {
//            if(6 * answer % n == 0) break;
//            answer++;
//        }
//
//        return answer;
    }
}

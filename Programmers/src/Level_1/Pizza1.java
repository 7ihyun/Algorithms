package Level_1;

public class Pizza1 {
    public static void main(String[] args) {
        Pizza1 pizza1 = new Pizza1();

        System.out.println("피자의 수 : " + Pizza1.solution(7));
        System.out.println("피자의 수 : " + Pizza1.solution(1));
        System.out.println("피자의 수 : " + Pizza1.solution(15));
    }
    public static int solution(int n) {
        // 피자 한 판은 7조각. n명이 모두 한 조각 이상 먹어야 함
        int answer = 0;
        int quotient = n / 7; // 몫
        int remainder = n % 7; // 나머지

        if (remainder == 0) answer = quotient;
        else if (remainder != 0) answer = quotient + 1;
        return answer;

//        int answer = (n%7==0) ? n/7 : n/7 + 1;
    }
}

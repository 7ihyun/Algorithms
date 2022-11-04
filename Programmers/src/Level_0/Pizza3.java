package Level_0;

public class Pizza3 {
    public static void main(String[] args) {
        Pizza3 pizza3 = new Pizza3();

        System.out.println("피자의 수 : " + Pizza3.solution(7, 10));
        System.out.println("피자의 수 : " + Pizza3.solution(4, 12));
    }
    public static int solution(int slice, int n) {
        // 피자 한 판은 2~10조각. n명이 최소 한 조각씩 먹어야 함
        int answer = 0;

        if (n % slice == 0) answer = n / slice;
        else answer = n / slice + 1;
        return answer;

//        return n % slice == 0 ? n / slice : (n / slice) + 1;
    }
}

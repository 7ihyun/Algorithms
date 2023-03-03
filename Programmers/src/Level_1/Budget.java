package Level_1;

import java.util.*;

public class Budget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        System.out.println("최대로 지원 가능한 부서의 수 : " + Budget.solution(d, 9));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}

package Level_1;

import java.util.*;

public class FruitSeller {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println("과일 장수가 얻을 수 있는 최대 이익 : " + FruitSeller.solution(3, 4, score));
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {
            if ((score.length - i) % m == 0) {
                answer += score[i] * m;
            }
        }

        return answer;
    }
}

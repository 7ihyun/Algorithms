package Level_1;

import java.util.ArrayList;
import java.util.Collections;

public class FailureRate {
    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println("실패율 : " + FailureRate.solution(5, stages));
    }
    public static int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];	// 각 스테이지에 머물러 있는 유저 수 (클리어 x)
        int[] totalCount = new int[N + 1];	// 각 스테이지에 도달한 전체 유저 수

        for (int i = 0; i < stages.length; i++) {
            count[stages[i]]++;
        }

        // 각 스테이지에 도달한 유저 수를 누적
        // 마지막 스테이지는 n + (n+1)번 째
        totalCount[N] = count[N] + count[N + 1];
        for (int i = N-1; i >= 1; i--) {
            totalCount[i] = count[i] + totalCount[i + 1];
        }

        ArrayList<Rate> arr = new ArrayList<>(); // 스테이지 번호, 실패율 저장
        for (int i = 1; i <= N; i++) {
            //스테이지에 도달한 유저가 없는 경우, 해당 스테이지의 실패율은 0
            if(totalCount[i]==0) {
                arr.add(new Rate(i, 0));
                continue;
            }

            double rate = (double) count[i] / totalCount[i];
            arr.add(new Rate(i, rate));
        }

        // fail rate가 높은 순으로 sorting
        Collections.sort(arr, ((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        // sorting 된 실패율의 stage 번호 저장
        int[] answer = new int[N];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).idx;
        }
        return answer;
    }
    static class Rate{
        int idx;	// stage number
        double rate; 	// fail rate

        public Rate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }
}

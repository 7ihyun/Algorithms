package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292 {
    public static void main(String[] args) throws IOException {
        /*
        1~N번 방까지 최소 몇 개의 방을 지나가는지
        1개 : 1
        2개 : 2~7 (+6)
        3개 : 8 ~ 19 (+12)
        4개 : 20 ~ 37 (+18)
        5개 : 38 ~ 61 (+24)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //N번 방
        int count = 1; //최단 루트
        int range = 2; //범위 (거리가 +1씩 늘어날 때, 범위는 +6)

        if (N == 1) System.out.println(1); //거리가 1이면 범위는 1
        else {
            while (range <= N) {
                range += 6 * count;
                count++;
            }
        }
        System.out.print(count);
    }
}
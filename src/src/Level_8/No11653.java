package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        /*
        N을 곱셈으로 분해하면 제곱근을 기준으로 대칭이 됨
        9의 경우 -> 1 * 9, 3 * 3, 9 * 1
        i * i 가 N 이하일 때까지 탐색
         */
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }
        if (N != 1) {
            sb.append(N);
        }
        System.out.println(sb);
    }
}

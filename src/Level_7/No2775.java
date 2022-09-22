package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2775 {
    /*
        a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호 까지 사람들의 수의 합만큼 사람들을 데려와 살아야 함
        k층 n호 에는 몇 명이 살고 있는가?

        k층 n호 = (k - 1)층 1호 + (k - 1)층 2호 + ⋯ + (k - 1)층 n호
        1 <= k <= 14, 1 <= n <= 14
    */
    public static int[][] APT = new int[15][15]; //범위 0~14
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        make_APT();	//아파트 생성

        int T = Integer.parseInt(br.readLine()); //테스트 케이스

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append('\n');
        }
        System.out.println(sb);
    }

    public static void make_APT() { //아파트 생성
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; //i층 1호
            APT[0][i] = i; //0층 i호
        }

        for (int i = 1; i < 15; i++) { //1층 ~ 14층

            for (int j = 2; j < 15; j++) { //2호 ~ 14호
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
}

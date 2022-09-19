package Level_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //n이 주어졌을 때 1~n까지의 합을 구하는 프로그램
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i=1; i<=n; i++) result+=i;

        System.out.println(result);
    }
}
package Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //N(3~5000) kg

        //설탕 봉지는 3kg, 5kg
        //Nkg 을 배달할 때 최소한의 봉지의 개수 -> 최대한 5kg 봉지로 구성

        if (N == 4 || N == 7) System.out.println(-1); //3kg과 5kg 으로 구성하지 못하는 경우 : -1
        else if (N % 5 == 0) System.out.println(N / 5); //설탕 봉지의 최소 개수 : N을 5로 나눈 몫
        else if (N % 5 == 1 || N % 5 == 3) System.out.println((N / 5) + 1); //N을 5로 나눈 몫 + 1
        else if (N % 5 == 2 || N % 5 == 4) System.out.println((N / 5) + 2); //N을 5로 나눈 몫 + 2
    }
}

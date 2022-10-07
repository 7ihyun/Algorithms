package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1712 {
    public static void main(String[] args) throws IOException {
        /*
        노트북 n개를 생산할 때 이익이 발생하는 시점의 n == n은 총 비용과 총 수익이 같아지는 지점(이익이 발생되는 지점X)
        n * 가격(C) = 고정 비용(A) + n * 가변 비용(B)
        -> n = A / (C - B) + 1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); //고정 비용
        int B = Integer.parseInt(st.nextToken()); //가변 비용
        int C = Integer.parseInt(st.nextToken()); //가격

        if (C <= B) System.out.println("-1"); //손익분기점이 존재하지 않을 때
        else System.out.println(A/(C-B)+1);
    }
}
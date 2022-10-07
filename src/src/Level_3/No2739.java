package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N을 입력받고 구구단 N단을 출력하는 프로그램
        //N은 1보다 크거나 같고, 9보다 작거나 같음
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i=1; i<10; i++) System.out.println(N + " * " + i + " = " + N*i);
    }
}

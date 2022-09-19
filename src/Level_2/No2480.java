package Level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        //3개의 변수가 서로 다른지, 같은지를 판단
        if (a != b && b != c && a != c) { //모든 변수가 다른 경우
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
        else if (a == b && a == c) System.out.println(10000 + a * 1000); //모든 변수가 같은 경우
        else if (a == b || a == c) System.out.println(1000 + a * 100); //a가 b 혹은 c랑만 같은 경우
        else System.out.println(1000 + b * 100); //b와 c가 같은 경우
    }
}

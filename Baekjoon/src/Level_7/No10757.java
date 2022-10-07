package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백을 기준으로 분리

        /*
        int, long 은 표현 가능한 범위를 넘어서게 되면 0으로 출력됨
        BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한대
         */
        BigInteger A = new BigInteger(st.nextToken()); //nextToken : StringTokenizer 에서 다음 토큰을 읽어옴
        BigInteger B = new BigInteger(st.nextToken());

        System.out.println(A.add(B)); //A+B 출력
    }
}
package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //토큰이 남아있는지의 여부(T/F)를 반환시켜주는 hasMoreTokens() 메소드를 사용할 것이므로, N은 변수를 두지 않고 입력만 받음
        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            //소수면 true, 아니면 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) continue; //1은 소수가 아님

            for (int i = 2; i <= Math.sqrt(num); i++) { //n의 제곱근까지 검사
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) count++;
        }
        System.out.println(count);
    }
}

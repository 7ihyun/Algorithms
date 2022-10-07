package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10250 {
    public static void main(String[] args) throws IOException {
        /*
        엘리베이터를 타고 이동하는 층 수는 신경쓰지 않지만, 걷는 거리가 같을 때는 아래층을 선호함
        102호 방 보다는 301호 방을 선호하고, 606호 보다는 506호를 선호함

        첫 번째 손님은 101호, 두 번째 손님은 201호, ...
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); //테스트 데이터
        //호텔의 층 수(H), 각 층의 방 수(W), N번째 손님

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());

            //W는 필요하지 않음
            // 백준에서 테스트할 때 N이 H*W의 값보다 크게 주어지지 않음 -> 테스트케이스에서 불가능한 예외 케이스를 넣지 않음

            st.nextToken();

            int N = Integer.parseInt(st.nextToken());

            if (N % H == 0) sb.append((H * 100) + (N / H)).append('\n');
            else sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
        }
        System.out.print(sb);
    }
}
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

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st.nextToken()); //테스트 데이터
        int H = Integer.parseInt(st.nextToken()); //호텔의 층 수
        int W = Integer.parseInt(st.nextToken()); //각 층의 방 수
        int N = Integer.parseInt(st.nextToken()); //N번째 손님

        for (int i = 0; i < T; i++) {

        }
    }
}

package Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class No1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //시험 과목의 개수

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1; //입력받을 수가 0 이상이기 때문에 -1로 초기화
        double sum = 0.0; //성적의 총 합

        /*
        점수 / M * 100
        시험 점수의 최고점이 70점이고 수학점수가 50이라면, 수학점수는 50/70*100 = 71.43
         */
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value > max) max = value;
            sum += value;
        }
        System.out.println(((sum / max) * 100.0) / N);
    }
}
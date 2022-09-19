package Level_3;

import java.io.*;
import java.util.StringTokenizer;

public class No15552 {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader와 BufferedWriter를 사용
        시간제한 1.5초
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //첫 줄에 테스트케이스 개수 T 입력 (최대 1,000,000)
        //다음 줄에 정수 A, B 입력 (1 이상 1,000 이하)
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
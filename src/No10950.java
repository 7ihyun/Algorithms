import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //정수 A, B를 입력받아 A+B를 출력하는 프로그램
        //첫째 줄에 테스트 케이스의 개수 T가 입력되고, 각 줄에 A와 B가 주어짐
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st; //한 줄에 두 정수가 입력되므로 공백을 기준으로 분리

        StringBuilder sb = new StringBuilder(); //문자열을 더하기 위해 StringBuilder 객체 생성

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));            sb.append('\n'); //줄바꿈
        }

        System.out.println(sb);
    }
}

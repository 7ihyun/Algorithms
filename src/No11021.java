import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 번호

        StringTokenizer st; //공백을 기준으로 문자열 분리
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #" + i + ": "
                    +(Integer.parseInt(st.nextToken())
                    +Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
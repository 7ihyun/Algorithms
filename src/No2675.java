import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" "); //공백으로 분리

            int R = Integer.parseInt(str[0]); //R번 반복, String->int
            String S = str[1];

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) System.out.print(S.charAt(j));
            }
            System.out.println();
        }
    }
}
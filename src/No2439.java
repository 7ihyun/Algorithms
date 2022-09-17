import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개,  N번째 줄에는 별 N개 (단, 오른쪽을 기준으로 정렬)
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) { //공백
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //별 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
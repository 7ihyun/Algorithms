import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개,  N번째 줄에는 별 N개
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
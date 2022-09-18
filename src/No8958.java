import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); //테스트 케이스

        String arr[] = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < T; i++) {
            int cnt = 0; // 연속된 O의 개수
            int sum = 0; //총 합

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') cnt++; //O가 있으면 +1
                else cnt = 0;
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}
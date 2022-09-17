import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x>0) { //x 좌표가 양수일 때
            if (y>0) System.out.println(1); //y 좌표가 양수라면 제1사분면
            else System.out.println(4); //y 좌표가 음수라면 제4사분면
        }
        else { //x 좌표가 음수일 때
            if (y<0) System.out.println(3); //y 좌표가 음수면 제3사분면
            else System.out.println(2); //y 좌표가 양수면 제2사분면
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //for문에서 n은 사용하지 않으므로 입력만 받음

        int sum = 0;
        for (byte value : br.readLine().getBytes()) sum += (value - 48);
        //byte로 변환해 문자열의 문자를 하나씩 읽을 수 있음
        //UTF-16 인코딩에 맞게 48 혹은 '0'을 빼야 함
        System.out.println(sum);
    }
}
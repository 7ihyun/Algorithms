import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10951 {
    public static void main(String[] args) throws IOException {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            int A = str.charAt(0) -48; //charAt() 은 해당 문자의 아스키코드 값을 반환함
            int B = str.charAt(2) -48; //정수형태로 변경하려면 -48 혹은 -'0' 를 해야함
            sb.append(A+B).append('\n');
        }
        System.out.println(sb);
    }
}
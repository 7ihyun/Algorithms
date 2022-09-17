import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //BufferedReader 는 문자열을 한 줄로 읽음
        // A와 B을 구분하기 위해 공백을 기준으로 문자열을 분리해주어야하니 StringTokenizer 을 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //현재 시
        int B = Integer.parseInt(st.nextToken()); //현재 분
        int C = Integer.parseInt(br.readLine()); //요리하는데 필요한 시간(분)

        int min = 60 * A + B; //시 → 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}

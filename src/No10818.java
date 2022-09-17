import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine()); //N은 입력만 받음

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //N개의 정수를 공백으로 구분

        //모든 정수는 -1,000,000 보다 크거나 같고, 1,000,000 보다 작거나 같음
        int max = -1000001; //비교를 위해 max에 가장 작은 값
        int min = 1000001;  //min에는 가장 큰 값을 초기화

        while (st.hasMoreTokens()) { //hasMoreTokens() 은 StringTokenizer 에 토큰이 남아있으면 True, 비어있으면 false 반환
            int val = Integer.parseInt(st.nextToken()); //nextToken() 은 StringTokenizer 에서 다음 토큰을 불러옴
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println(min + " " + max);
    }
}
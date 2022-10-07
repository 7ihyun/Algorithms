package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2869 {
    public static void main(String[] args) throws IOException {
        //시간 제한 0.15초
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); //달팽이가 낮 동안 올라간 A미터
        int B = Integer.parseInt(st.nextToken()); //자는 동안 B미터 미끄러짐
        int V = Integer.parseInt(st.nextToken()); //나무의 높이 V

        /*
        1. ( 7 - 1 ) % ( 3 - 1 ) = 0
        2. ( 8 - 1 ) % ( 3 - 1 ) = 1
        1번과 2번 모두 몫은 3이지만 2번은 나머지가 생김
        A와 B의 차이 값으로 나누어 떨어지지 않고 잔여 블럭이 남아있기 때문
        그래서 한 번 더 미끄러지고 다시 올라가야 함 -> 하루가 더 소요됨
         */
        int day = (V - B) / (A - B);

        //잔여 블럭이 있는 경우
        if ((V - B) % (A - B) != 0) {
            day++; //1일 추가
        }
        System.out.println(day);
    }
}

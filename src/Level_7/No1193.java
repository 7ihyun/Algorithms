package Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1193 {
    public static void main(String[] args) throws IOException {
        /*
        분모와 분자 값의 합을 T라고 할 때, 표를 대각선으로 분류할 수 있음
        대각선 칸의 개수는 T-1

        대각선은 짝수->홀수->짝수->홀수->... 순서임
        홀수 그룹은 분자가 감소하며 분모가 증가
        짝수 그룹은 분자가 증가하고 분모가 감소
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine()); //X번째 분수
        int count = 1, sum = 0; //해당 대각선의 개수, 직전 대각선의 누적 합

        while (true) {

            //해당 대각선의 개수 + 직전 대각선의 누적 합
            if (X <= count + sum) {

                //대각선의 개수가 짝수일 때
                if (count % 2 == 0) {
                    //분자 : X - 직전 대각선까지의 블럭 개수
                    //분모 : 대각선 상의 블럭의 개수 - X - 직전 대각선까지의 블럭 개수 - 1
                    System.out.print((X - sum) + "/" + (count - (X - sum - 1)));
                    break;
                }
                else {
                    //분자 : 대각선 상의 블럭의 개수 - X - 직전 대각선까지의 블럭 개수 - 1
                    //분모 : X - 직전 대각선까지의 블럭 개수
                    //-> 짝수일 때의 분자/분모를 반대로 출력
                    System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }
            }
            else {
                sum += count;
                count++;
            }
        }
    }
}
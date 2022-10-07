package Level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int H = Integer.parseInt(str[0]); //hour
        int M = Integer.parseInt(str[1]); //minute

        //45분 일찍 알람 설정
        //24시간 표현 0:0 ~ 23:59
        if (M<45) {
            H--;
            M = 60 - (45 - M);

            if (H<0) H = 23;

            System.out.println(H + " " + M);
        }
        else System.out.println(H + " " + (M-45));
    }
}
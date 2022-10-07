package Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //알파벳의 개수
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') arr[s.charAt(i) - 97]++;
            else arr[s.charAt(i) - 65]++;
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) ch = '?'; //가장 많이 사용된 알파벳이 여러개 존재하는 경우
        }
        System.out.println(ch);
    }
}
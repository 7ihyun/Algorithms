import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int형 배열을 생성해 -1로 초기화
        int[] arr = new int[26]; //알파벳의 개수 26
        for (int i = 0; i < arr.length; i++) arr[i] = -1;

        String S = br.readLine(); //S라는 문자열이 주어짐

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (arr[ch - 'a'] == -1) arr[ch - 'a'] = i; //arr의 값이 -1인 경우에 초기화
        }
        for (int value : arr) System.out.print(value + " "); //배열 출력
    }
}
import java.util.Scanner;
import java.util.StringTokenizer;

public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s, " "); //st에 공백을 기준으로 나눈 토큰을 저장
        System.out.println(st.countTokens()); //countTokens() 는 토큰의 개수를 반환
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        //연도가 4의 배수이면서 400의 배수일 때 혹은 100의 배수가 아닐 때인 윤년을 구하라
        if (year%4==0) {
            if (year%400==0) System.out.println("1");
            else if (year%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}

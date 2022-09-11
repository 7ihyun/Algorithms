import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A*(B%10)); //일의 자리
        System.out.println(A*(B%100/10)); //십의 자리
        System.out.println(A*(B/100)); //백의 자리
        System.out.println(A*B); //A*B의 값
    }
}

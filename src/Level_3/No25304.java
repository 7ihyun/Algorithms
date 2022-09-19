package Level_3;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //구매한 물건의 가격과 개수를 입력받아 계산한 총 금액이 영수증의 총 금액과 일치하는지 검사
        int X = sc.nextInt(); //영수증의 총 금액
        int N = sc.nextInt(); //구매한 물건의 종류의 수

        int product[][] = new int[N][2]; //[0] 상품 가격, [1] 상품 개수

        int result = 0;
        for (int i=0; i<product.length; i++) {
            product[i][0] = sc.nextInt(); //상품 가격
            product[i][1] = sc.nextInt(); //상품 개수
            result += product[i][0] * product[i][1]; //가격 * 개수
        }

        if (X == result) System.out.println("Yes"); //계산한 금액과 영수증의 금액이 일치
        else System.out.println("No"); //불일치
    }
}
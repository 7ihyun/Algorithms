import java.util.Scanner;

public class No3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chess[] = {1, 1, 2, 2, 2, 8}; //입력값과 비교하기 위한 배열
        int input[] = new int[6];
        for (int i=0; i<input.length; i++) {
            input[i] = sc.nextInt(); //6개의 정수 입력
            System.out.print(chess[i] - input[i] + " "); //chess에서 입력한 값을 빼서 chess가 되기 위한 부족하거나 많은 수를 출력
        }
    }
}

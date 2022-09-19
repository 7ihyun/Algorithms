package Level_4;

import java.util.Scanner;

public class No4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int C = sc.nextInt(); //테스트 케이스의 개수

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt(); //학생 수
            arr = new int[N];

            double sum = 0; //소수점 셋째 자리까지 출력하기 위해 double

            for (int j = 0; j < N; j++) {
                int value = sc.nextInt(); //성적 입력
                arr[j] = value;
                sum += value; //성적 합계
            }

            double avg = sum / N; //평균
            double count = 0; //평균을 넘는 학생의 수

            for (int j = 0; j < N; j++) { //평균을 넘는 학생의 비율 찾기
                if (arr[j] > avg) count++;
            }
            System.out.printf("%.3f%%\n", (count / N) * 100);
        }
    }
}
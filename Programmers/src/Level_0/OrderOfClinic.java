package Level_0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class OrderOfClinic {
    public static void main(String[] args) {
        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        System.out.println("진료 순서: " + OrderOfClinic.solution(emergency1));
        System.out.println("진료 순서: " + OrderOfClinic.solution(emergency2));
        System.out.println("진료 순서: " + OrderOfClinic.solution(emergency3));
    }
    public static int[] solution(int[] emergency) {
        /*
         * Arrays.copyOf(원본배열, 복사할 길이);
         * Arrays.copyOfRange(원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스);
         */
        // 깊은 복사 사용(원본 배열과 복사된 배열은 서로 영향을 받지 않기 때문)
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (emergency[i] == copy[j])
                    answer[i] = emergency.length - j;
            }
        }
        return answer;

//        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}

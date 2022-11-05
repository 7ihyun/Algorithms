package Level_0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlipArray {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 0, 1, 1, 1, 3, 5};

        FlipArray flipArray = new FlipArray();

        System.out.println(FlipArray.solution(list1));
        System.out.println(FlipArray.solution(list2));
    }
    public static int[] solution(int[] num_list) {
        // 뒤집힌 요소들을 담을 배열
        int[] answer = new int[num_list.length];

        // 배열의 마지막 인덱스(i)부터 탐색하여 answer에 순서대로 저장
        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }
//        for(int i = 0; i< num_list.length; i++){
//            answer[i] = num_list[num_list.length-i-1];
//        }
        return answer;

//        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
//
//        Collections.reverse(list);
//        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

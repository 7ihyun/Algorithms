package Level_0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("회전시킨 배열 : " + ArrayRotation.solution(numbers, "right"));
    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < answer.length; i++) {
            if (direction.equals("right")) {
                while (i < numbers.length - 1) {
                    answer[0] = numbers[numbers.length - 1];
                    answer[i + 1] = numbers[i];
                    i++;
                }
            }
            if (direction.equals("left")) {
                while(i < numbers.length - 1) {
                    answer[i] = numbers[i + 1];
                    i++;
                }
                answer[numbers.length - 1] = numbers[0];
            }
        }

        return answer;
    }
}

//    List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//        if (direction.equals("right")) {
//                list.add(0, list.get(list.size() - 1));
//                list.remove(list.size() - 1);
//                } else {
//                list.add(list.size(), list.get(0));
//                list.remove(0);
//                }
//                return list.stream().mapToInt(Integer::intValue).toArray();
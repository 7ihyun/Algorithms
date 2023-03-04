package Level_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println("문자열 내림차순으로 배치하기 : " + DescendingOrder.solution("Zbcdefg"));
    }
    public static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}

// 다른 풀이

//return Stream.of(str.split(""))
//        .sorted(Comparator.reverseOrder())
//        .collect(Collectors.joining());
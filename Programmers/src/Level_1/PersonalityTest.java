package Level_1;

import java.util.*;

public class PersonalityTest {
    public static void main(String[] args) {
        String [] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println("성격 유형 검사 결과 : " + PersonalityTest.solution(survey, choices));
    }
    public static String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< survey.length; i++) {
            int value = choices[i];

            if(value > 0 && value < 4) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
            } else if(value > 4) {
                char ch = survey[i].charAt(1);
                map.put(ch, map.getOrDefault(ch, 0) + value - 4);
            }

        }

        return new StringBuilder()
                .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
                .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
                .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
                .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }
}

// 다른 풀이

//    String answer = "";
//    char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
//    int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
//    HashMap<Character, Integer> point = new HashMap<Character, Integer>();
//
//    // 점수 기록할 배열 초기화
//    for (char[] t : type) {
//        point.put(t[0], 0);
//        point.put(t[1], 0);
//    }
//
//    // 점수 기록
//    for (int idx = 0; idx < choices.length; idx++){
//        if(choices[idx] > 4){
//            point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
//        } else {
//            point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
//        }
//    }
//
//    // 지표 별 점수 비교 후 유형 기입
//    for (char[] t : type) {
//        answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
//    }
//
//    return answer;
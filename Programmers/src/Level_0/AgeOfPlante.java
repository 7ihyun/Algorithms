package Level_0;

import java.util.stream.Collectors;

public class AgeOfPlante {
    public static void main(String[] args) {
        System.out.println(AgeOfPlante.solution(23));
        System.out.println(AgeOfPlante.solution(51));
        System.out.println(AgeOfPlante.solution(100));
    }
    public static String solution(int age) {
        // a = 0, b = 1, c = 2, ... j = 9
        // 23은 cd
        String answer = "";
        String[] arr = String.valueOf(age).split("");

        for (int i = 0; i < arr.length; i++) {
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        }
        return answer;

//        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}

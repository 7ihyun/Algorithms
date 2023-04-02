package Level_1;

public class MiddleLetter {
    public static void main(String[] args) {
        System.out.println("가운데 글자 : " + MiddleLetter.solution("abcde"));
        System.out.println("가운데 글자 : " + MiddleLetter.solution("banana"));
    }
    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;

        // 다른 풀이
//        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}

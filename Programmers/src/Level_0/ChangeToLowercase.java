package Level_0;

public class ChangeToLowercase {
    public static void main(String[] args) {
        System.out.println("소문자로 바꾼 문자열 : " + ChangeToLowercase.solution("aBcDeFg"));
    }
    public static String solution(String myString) {
        String answer = myString.toLowerCase();
        return answer;
    }
}

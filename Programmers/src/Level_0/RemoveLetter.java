package Level_0;

public class RemoveLetter {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "BCBdbe";

        System.out.println(RemoveLetter.solution(str1, "f"));
        System.out.println(RemoveLetter.solution(str2, "B"));
    }
    public static String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}

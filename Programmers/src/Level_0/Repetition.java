package Level_0;

public class Repetition {
    public static void main(String[] args) {
        Repetition repetition = new Repetition();
        String str = "hello";

        System.out.println(Repetition.solution(str, 3));
    }
    public static String solution(String my_string, int n) {
        String answer = "";

        char[] chars = my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < n; j++) {
                answer += chars[i];
            }
        }
        return answer;

        // 다른 풀이 1
//        String[] str = my_string.split("");
//
//        for(int i=0; i<my_string.length(); i++){
//            answer += str[i].repeat(n);
//        }
//        return answer;

        // 다른 풀이 2
//        StringBuilder sb = new StringBuilder();
//        for(char c : my_string.toCharArray()){
//            sb.append((c + "").repeat(n));
//        }
//        return sb.toString();
    }
}

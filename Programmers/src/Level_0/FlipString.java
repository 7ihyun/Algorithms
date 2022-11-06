package Level_0;

import java.util.List;

public class FlipString {
    public static void main(String[] args) {
        FlipString flipString = new FlipString();
        String str1 = "jaron";
        String str2 = "bread";

        System.out.println(FlipString.solution(str1));
        System.out.println(FlipString.solution(str2));
    }
    public static String solution(String my_string) {
        String reverse = new StringBuffer(my_string).reverse().toString();
        return reverse;
    }
}

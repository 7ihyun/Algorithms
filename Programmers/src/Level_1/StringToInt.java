package Level_1;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println("문자열을 정수로 변환한 결과 : " + StringToInt.solution("1234"));
        System.out.println("문자열을 정수로 변환한 결과 : " + StringToInt.solution("-1234"));
    }
    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}

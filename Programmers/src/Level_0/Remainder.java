package Level_0;

public class Remainder {
    public static void main(String[] args) {
        Remainder remainder = new Remainder();
        System.out.println("나머지 : " + Remainder.solution(3, 2));
    }
    public static int solution(int num1, int num2) {
        return num1 % num2;
    }
}

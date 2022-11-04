package Level_0;

public class Multiplication {
    public static void main(String[] args) {
        Multiplication result = new Multiplication();

        System.out.println("두 수의 곱 : " + result.solution(27, 19));
    }
    public static int solution(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
}

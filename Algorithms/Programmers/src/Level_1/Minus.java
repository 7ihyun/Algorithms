package Level_1;

public class Minus {
    public static void main(String[] args) {
        Minus result = new Minus();

        System.out.println("두 수의 차 : " + result.solution(2, 3));
    }
    public static int solution(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}

package Level_1;

public class Quotient {
    public static void main(String[] args) {
        Quotient quotient = new Quotient();

        System.out.println("몫 : " + Quotient.solution(10, 5));
    }
    public static int solution(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}

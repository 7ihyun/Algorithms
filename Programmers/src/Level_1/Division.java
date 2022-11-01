package Level_1;

public class Division {
    public static void main(String[] args) {
        Division division = new Division();

        System.out.println("나눗셈*1,000 : " + Division.solution(3, 2));
    }
    public static int solution(int num1, int num2) {
        double answer = ((double) num1 / num2) * 1000;
        return (int)answer;
    }
}

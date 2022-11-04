package Level_1;

public class Comparison {
    public static void main(String[] args) {
        Comparison comparison = new Comparison();

        System.out.println("수 비교하기 : " + Comparison.solution(3, 1));
    }
    public static int solution(int num1, int num2) {
        // 두 수가 같으면 1, 다르면 -1
        if (num1 == num2) return 1;
        else return -1;

//        return num1 == num2 ? 1 : -1;
    }
}

package Level_1;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(HarshadNumber.solution(10));
    }
    public static boolean solution(int x) {
        int num = x;
        int sum = 0;

        while (num >= 1) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}

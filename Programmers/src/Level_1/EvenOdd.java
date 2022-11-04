package Level_1;

public class EvenOdd {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        EvenOdd evenOdd = new EvenOdd();

        System.out.println("결과 : " + evenOdd.solution(3));
        System.out.println("결과 : " + evenOdd.solution(2));
    }
    String solution(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";

//        return num % 2 == 0 ? "Even" : "Odd";
    }
}

package Level_0;

public class Protractor {
    public static void main(String[] args) {
        System.out.println(Protractor.solution(70));
        System.out.println(Protractor.solution(91));
        System.out.println(Protractor.solution(180));
    }
    public static int solution(int angle) {
        if (angle > 0 && angle < 90) return 1; // 예각
        else if (angle == 90) return 2; // 직각
        else if (angle > 90 && angle < 180) return 3; // 둔각
        else return 4; // 평각
    }
}

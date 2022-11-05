package Level_0;

public class Age {
    public static void main(String[] args) {
        Age age = new Age();

        System.out.println(Age.solution(40));
        System.out.println(Age.solution(23));
    }
    public static int solution(int age) {
        // 나이의 출생 연도를 리턴 (2022년도 기준, 태어난 연도에 1살)
        return 2022 - age + 1;
    }
}

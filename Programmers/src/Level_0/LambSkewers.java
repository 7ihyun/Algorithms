package Level_0;

public class LambSkewers {
    public static void main(String[] args) {
        System.out.println(LambSkewers.solution(10, 3));
        System.out.println(LambSkewers.solution(64, 6));
    }
    public static int solution(int n, int k) {
        // 양꼬치는 1인분에 12,000원. 음료는 2,000원.
        // 10인분을 시키면 음료수 1개가 서비스 (64인분이면 음료수 6개)
        // 양꼬치 n인분과 음료수 k개를 먹었을 때의 금액
        int lamb = n * 12_000;
        int drink = k * 2_000;
        int answer = lamb + drink;

        if (n >= 10)
            answer = answer - ((n / 10) * 2_000);
        return answer;
    }
}

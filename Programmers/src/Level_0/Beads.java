package Level_0;

public class Beads {
    public static void main(String[] args) {
        System.out.println(Beads.solution(3, 2));
        System.out.println(Beads.solution(5, 3));
    }
    public static int solution(int balls, int share) {
        /**
         * n개 중에 a개를 순서 없이 뽑는 전체 경우의 수
         * 분자 : n * (n-1) * (n -2)를 a개 만큼 진행한 값
         * 분모 : a * (a - 1) * (a - 2)를 a가 1이 될 때까지 진행한 값
         */
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return (int) result;
    }
}

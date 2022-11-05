package Level_0;

public class IceAmericano {
    public static void main(String[] args) {
        IceAmericano iceAmericano = new IceAmericano();

        System.out.println(IceAmericano.solution(5500));
        System.out.println(IceAmericano.solution(15000));
    }
    public static int[] solution(int money) {
        // 아메리카노 한 잔 5,500원
        // 최대로 마실 수 있는 아메리카노 잔 수와 남는 돈을 담을 배열
        int[] answer = new int[2];

        answer[0] = money / 5500; // 아메리카노 잔 수
        answer[1] = money % 5500; // 남는 돈

        return answer;

//        return new int[] {money / 5500, money % 5500};
    }
}

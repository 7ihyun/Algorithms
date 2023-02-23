package Level_1;

public class InsufficientAmount {
    public static void main(String[] args) {
        System.out.println("부족한 금액 : " + InsufficientAmount.solution(3, 20, 4));
    }
    // 놀이기구를 N번째 이용하면, 이용료의 N배
    // 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i < count + 1; i++) {
            sum += price * i;
        }

        if (sum > money) {
            answer = sum - money;
        }

        return answer;
    }
}

// 다른 풀이
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);


//        long answer = money;
//
//        for (int i = 0; cnt < count; i++) {
//        answer -= (price * (i + 1));
//        }
//
//        return (answer > 0 ? 0 : -answer);


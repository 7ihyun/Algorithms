package Level_1;

public class Trio {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println("삼총사를 만들 수 있는 방법의 수 : " + Trio.solution(number));
    }
    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length-2; i++) {
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (0 == number[i] + number[j] + number[k]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}

package Level_1;

import java.util.stream.IntStream;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        RemoveEvenNumbers removeEvenNumbers = new RemoveEvenNumbers();
        System.out.println("홀수 : " + RemoveEvenNumbers.solution(15));
    }
    public static int[] solution(int n) {
        int[] answer = new int[(n+1)/2];

        for(int i = 1; i <= n; i++) {
            // i가 홀수인 경우
            if(i % 2 == 1) {
                answer[i/2] = i;
            }
        }
        return answer;

//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

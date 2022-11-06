package Level_0;

public class NumberOfEvenOdd {
    public static void main(String[] args) {
        NumberOfEvenOdd numberOfEvenOdd = new NumberOfEvenOdd();
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 3, 5, 7};

        System.out.println(NumberOfEvenOdd.solution(list1));
        System.out.println(NumberOfEvenOdd.solution(list2));
    }
    public static int[] solution(int[] num_list) {
        // 짝수와 홀수의 개수를 담을 배열
        int[] answer = new int[2];

        for (int i = 0; i < num_list.length; i++) {
            // i가 짝수인 경우
            if (num_list[i] % 2 == 0) answer[0]++;
            // 홀수인 경우
            else answer[1]++;
        }
        return answer;

        // 다른 풀이
//        for (int i = 0; i < num_list.length; i++) {
//            answer[num_list[i] % 2]++;
//        }
//        return answer;
    }
}

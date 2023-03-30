package Level_0;

public class TheLargestNumber {
    public static void main(String[] args) {
        System.out.println("가장 큰 수와 그 수의 인덱스 : " + TheLargestNumber.solution(new int[]{1, 8, 3}));
    }
    public static int[] solution(int[] array) {
        int[] answer = new int [2];

        int max = 0;
        int index = 0;
        for(int i =0; i<array.length; i++) {
            if( max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;


        return answer;
    }
}

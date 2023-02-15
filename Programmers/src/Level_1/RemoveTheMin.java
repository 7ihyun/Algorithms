package Level_1;

public class RemoveTheMin {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println("제일 작은 수 제거하기 : " + RemoveTheMin.solution(arr));
    }
    public static int[] solution(int[] arr) {
        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        if (arr.length <= 1) {
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }
        }

        return answer;
    }
}
// steam을 사용한 풀이
//    if (arr.length <= 1) return new int[]{ -1 };
//    int min = Arrays.stream(arr).min().getAsInt();
//    return Arrays.stream(arr).filter(i -> i != min).toArray();
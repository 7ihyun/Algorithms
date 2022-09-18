public class No4673 {
    public static void main(String[] args) {
        boolean[] bl = new boolean[10001]; //1~10,000까지
        for (int i = 1; i <10001; i++) {
            int n = d(i);
            if (n < 10001) bl[n] = true; //10,000이 넘는 수는 필요X
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!bl[i]) sb.append(i).append('\n'); //false인 인덱스만 출력
        }
        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10; //첫째 자리 수
            number /= 10; //10을 나눠 첫째 자리를 없앰
        }
        return sum;
    }
}
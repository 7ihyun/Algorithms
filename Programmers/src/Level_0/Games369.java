package Level_0;

public class Games369 {
    public static void main(String[] args) {
        System.out.println("머쓱이가 쳐야할 박수의 횟수 : " + Games369.solution(3));
    }
    public static int solution(int order) {
        int answer = 0;
        int count = 0;
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                count++;
            }
            order = order / 10;
        }
        answer = count;
        return answer;

        // 다른 풀이
//        int answer = 0;
//        String strOrder = "" + order;
//        for (int i = 0; i < strOrder.length(); i++) {
//            char tempChar = strOrder.charAt(i);
//
//            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
//                answer++;
//            }
//        }
//        return answer;
    }
}

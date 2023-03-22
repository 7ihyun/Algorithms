package Level_1;

public class Overpainting {
    public static void main(String[] args) {
        System.out.println("롤러로 페인트칠을 해야 하는 최소 횟수 : " + Overpainting.solution(8, 4, new int[]{2, 3, 6}));
    }
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) continue;

            answer += 1;
            max = section[i] + m;
        }
        return answer;

        // 다른 풀이

//        int maxPainted = 0, cntPaint = 0;
//        for (int point : section) {
//            if (maxPainted <= point) {
//                maxPainted = point + m;
//                cntPaint++;
//            }
//        }
//        return cntPaint;
    }
}

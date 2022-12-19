package Level_0;

public class Point {
    public static void main(String[] args) {
        int[] coordinates1 = {2, 4};
        int[] coordinates2 = {-7, 9};

        System.out.println(Point.solution(coordinates1));
        System.out.println(Point.solution(coordinates2));
    }
    public static int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0) {          //1사분면
            answer=1;
        }else if(dot[0]<0 && dot[1]>0) {    //2사분면
            answer=2;
        }else if(dot[0]<0 && dot[1]<0) {    //3사분면
            answer=3;
        }else if(dot[0]>0 && dot[1]<0) {    //4사분면
            answer=4;
        }
        return answer;
    }
}
/*
if(dot[0] > 0) {
    if(dot[1] > 0) answer = 1;
    else answer = 4;
}else {
    if(dot[1] > 0) answer = 2;
    else answer = 3;
}
 */

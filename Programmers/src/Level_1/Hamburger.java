package Level_1;

import java.util.*;

public class Hamburger {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println("포장하는 햄버거 개수 : " + Hamburger.solution(arr));
    }
    // ingredient의 원소는 1, 2, 3 중 하나의 값
    // 순서대로 빵, 야채, 고기를 의미
    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);

            // 스택의 크기가 4 이상인 경우부터 조건처리
            if (stack.size() > 3) {
                // 스택 1231이 연속으로 들어간 경우
                if (stack.get(stack.size() - 4) == 1
                        && stack.get(stack.size() - 3) == 2
                        && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 1) == 1
                ) {
                    answer++;
                    // 1231 각각의 스택 4가지를 삭제
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }


        return answer;
    }
}

// 다른 풀이

//        int[] stack = new int[ingredient.length];
//        int sp = 0;
//        int answer = 0;
//        for (int i : ingredient) {
//            stack[sp++] = i;
//            if (sp >= 4 && stack[sp - 1] == 1
//                && stack[sp - 2] == 3
//                && stack[sp - 3] == 2
//                && stack[sp - 4] == 1)
//            {
//                sp -= 4;
//                answer++;
//            }
//        }
//        return answer;


//        for(int i=0; i<ingredient.length-3; i++){
//            if(ingredient[i]==0) continue;
//            if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1){
//                for(int j=i+3; j>0;j--){
//                ingredient[j] = (j>3) ? ingredient[j-4] : 0;
//                }
//                answer++;
//            }
//        }
//        return answer;
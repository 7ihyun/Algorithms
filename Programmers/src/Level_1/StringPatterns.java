package Level_1;

public class StringPatterns {
    public static void main(String[] args) {
        System.out.println("패턴에 따른 문자열 : " + StringPatterns.solution(3));
    }
    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            }
            else {
                answer += "박";
            }
        }
        return answer;
    }
}

// 다른 풀이

//    for(int i = 0; i < n; i++) {
//        result += (i % 2 == 0) ? "수" : "박";
//    }


//    return new String(new char [n / 2 + 1]).replace("\0", "수박").substring(0, n);
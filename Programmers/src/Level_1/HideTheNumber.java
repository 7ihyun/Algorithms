package Level_1;

public class HideTheNumber {
    public static void main(String[] args) {
        System.out.println("가린 전화번호 : " + HideTheNumber.solution("01033334444"));
    }
    public static String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            }
            else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }
}

// 다른 풀이

//    char[] ch = phone_number.toCharArray();
//    for (int i = 0; i < ch.length - 4; i ++) {
//        ch[i] = '*';
//    }
//    return String.valueOf(ch);


//    for (int i = 0; i < phone_number.length() - 4; i++) {
//            answer += "*";
//    }
//    answer += phone_number.substring(phone_number.length() - 4);
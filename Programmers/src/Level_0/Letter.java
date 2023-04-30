package Level_0;

public class Letter {
    public static void main(String[] args) {
        System.out.println("편지지의 최소 가로 길이 : " + Letter.solution("happy birthday!"));
    }
    public static int solution(String message) {
        return message.length() * 2;    // 한 글자 가로 길이 2cm
    }
}

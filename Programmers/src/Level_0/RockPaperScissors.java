package Level_0;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(RockPaperScissors.solution("2"));
        System.out.println(RockPaperScissors.solution("205"));
    }
    public static String solution(String rsp) {
        // 가위 : 2, 바위 : 0, 보 : 5
        String result = "";

        // 이길 수 있는 경우의 수
        for (int i = 0; i < rsp.length(); i++) {
            result += (
                    rsp.split("")[i].equals("0") ? "5"
                    : rsp.split("")[i].equals("2") ? "0"
                    : rsp.split("")[i].equals("5") ? "2" : "");
        }
        return result;
    }
}

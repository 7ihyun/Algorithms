package Level_0;

public class Ant {
    public static void main(String[] args) {
        System.out.println(Ant.solution(23));
        System.out.println(Ant.solution(24));
        System.out.println(Ant.solution(999));
    }
    public static int solution(int hp) {
        /*
        * 사냥감의 체력: hp
        * 장군개미 공격력: 5
        * 병정개미 공격력: 3
        * 일개미 공격력: 1
        * 사냥감의 체력을 넘지 않게 최소한의 병력을 구성하라.
         */
        return hp / 5 + (hp % 5 / 3) + (hp % 5 % 3);
    }
}

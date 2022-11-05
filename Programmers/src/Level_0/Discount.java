package Level_0;

public class Discount {
    public static void main(String[] args) {
        Discount discount = new Discount();

        System.out.println(Discount.solution(150000));
        System.out.println(Discount.solution(580000));
    }
    public static int solution(int price) {
        // 10만원 이상이면 5% 할인
        if (price >= 100000 && price < 300000) return price *= 0.95;
        // 30만원 이상이면 10% 할인
        else if (price >= 300000 && price < 500000) return price *= 0.9;
        // 50만원 이상이면 20% 할인
        else if (price >= 500000) return price *= 0.8;

        return price;
    }
}

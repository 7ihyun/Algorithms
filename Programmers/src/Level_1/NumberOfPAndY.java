package Level_1;

public class NumberOfPAndY {
    public static void main(String[] args) {
        System.out.println(NumberOfPAndY.solution("pPoooyY"));
    }
    public static boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split("");

        for (int i = 0; i < array.length; i++) {
            if ("p".equals(array[i])) {
                pCount++;
            } else if ("y".equals(array[i])) {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return true;
    }
}

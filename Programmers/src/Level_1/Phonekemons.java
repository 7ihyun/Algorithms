package Level_1;

import java.util.*;

public class Phonekemons {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println("최대로 고를 수 있는 폰켓몬 종류의 수 : " + Phonekemons.solution(nums));
    }
    public static int solution(int[] nums) {
        int max = nums.length / 2;

        // 중복 제거
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        if (hs.size()>nums.length/2) {
            return nums.length / 2;
        }

        return hs.size();
    }
}

// 다른 풀이

//return Arrays.stream(nums)
//        .boxed()
//        .collect(Collectors.collectingAndThen(Collectors.toSet(),
//        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
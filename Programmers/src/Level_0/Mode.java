package Level_0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mode {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        Mode mode = new Mode();
        System.out.println("최빈값 : " + Mode.solution(array));
    }
    public static int solution(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());

        if (list.size() > 1) {
            if (list.get(0).getValue() == list.get(1).getValue()) return -1;
        }

        return list.get(0).getKey();
    }
}

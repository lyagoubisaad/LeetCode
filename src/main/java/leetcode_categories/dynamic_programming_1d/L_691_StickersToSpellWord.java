package leetcode_categories.dynamic_programming_1d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_691_StickersToSpellWord {
    public int minStickers(String[] stickers, String target) {

        List<HashMap<Character, Integer>> stickersMap = new ArrayList<>();
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (int i=0;i<target.length();i++) {
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0)+1);
        }
        for (String sticker : stickers) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < sticker.length(); j++) {
                if(!targetMap.containsKey(sticker.charAt(j))) continue;
                map.put(sticker.charAt(j), map.getOrDefault(sticker.charAt(j), 0) + 1);
            }
            if(map.isEmpty()) continue;
            stickersMap.add(new HashMap<>(map));
        }
        return helper(targetMap, stickersMap);
    }

    private int helper(HashMap<Character, Integer> targetMap, List<HashMap<Character, Integer>> stickersMap) {
        if(targetMap.isEmpty()) return 0;
        int result = 1000000;
        for (HashMap<Character, Integer> map : stickersMap) {
            HashMap<Character, Integer> copyTargetMap = new HashMap<>(targetMap);
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(!copyTargetMap.containsKey(entry.getKey())) continue;
                copyTargetMap.put(entry.getKey(), copyTargetMap.get(entry.getKey())-1);
                if(copyTargetMap.get(entry.getKey()) == 0) copyTargetMap.remove(entry.getKey());
            }
            result = Math.min(result, 1+helper(new HashMap<>(copyTargetMap), stickersMap));
        }
        return 1+result;
    }
}

package LeetCodeCategories.slidingWindow;

import java.util.HashMap;

public class L_567_PermutationinString {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> store = count(s1);
        int l=0, r=0;
        int sum;
        boolean flag;
        HashMap<Character, Integer> store1 = new HashMap<>(store);
        while (r<s2.length()) {
            if(!store.containsKey(s2.charAt(r))) {
                r++;
                l=r;
                store1 = new HashMap<>(store);
            } else {
                store1.put(s2.charAt(r), store1.getOrDefault(s2.charAt(r),0)-1);
                r++;
            }
            sum = 0;
            flag = false;
            for (int value: store1.values()) {
                sum += value;
                if(value < 0) {
                    store1.put(s2.charAt(l),store1.getOrDefault(s2.charAt(l),0)+1);
                    l++;
                    flag = true;
                }
            }
            if(sum == 0 && !flag) return true;
        }
        return false;
    }

    public static HashMap<Character,Integer> count(String s1) {
        HashMap<Character,Integer> store = new HashMap<>();
        for (int i=0;i<s1.length();i++) {
            store.put(s1.charAt(i), store.getOrDefault(s1.charAt(i),0)+1);
        }
        return store;
    }
}

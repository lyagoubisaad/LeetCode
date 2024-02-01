package LeetCodeCategories.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static LeetCodeCategories.String.L_242_Valid_Anagram.isAnagram;

public class L_49_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,Integer> store = new HashMap<>();
        int count = 0;
        boolean flag;
        store.put(strs[0], count);
        list.add(new ArrayList<>());
        list.get(count).add(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            flag = true;
            for (String key : store.keySet()) {
                if(isAnagram(key, strs[i])) {
                    store.put(strs[i], store.get(key));
                    list.get(store.get(key)).add(strs[i]);
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
                list.add(new ArrayList<>());
                list.get(count).add(strs[i]);
                store.put(strs[i], count);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"",""};
        groupAnagrams(strs);
    }
}

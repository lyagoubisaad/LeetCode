package LeetCodeCategories.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_17_LetterCombinationsOfAPhoneNumber {
    HashMap<Integer, List<String>> store = new HashMap<>();
    List<String> res = new ArrayList<>();
    List<StringBuilder> listSb = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        initMap();
        dfs(digits);
        return res;
    }

    private void dfs(String s) {
        if(s.length() == 0) {
            for (StringBuilder stringBuilder : listSb) {
                res.add(stringBuilder.toString());
            }
            return;
        }
        List<String> allAvailableChars = store.get(Integer.parseInt(String.valueOf(s.charAt(0))));
        for (String allAvailableChar : allAvailableChars) {
            if (listSb.size() == 0) {
                listSb.add(new StringBuilder(allAvailableChar));
                if (s.length() == 1) {
                    dfs("");
                } else {
                    dfs(s.substring(1));
                }
                listSb.set(0, listSb.get(0).deleteCharAt(0));
            } else {
                for (int j = 0; j < listSb.size(); j++) {
                    listSb.set(j, listSb.get(j).append(allAvailableChar));
                    if (s.length() == 1) {
                        dfs("");
                    } else {
                        dfs(s.substring(1));
                    }
                    listSb.set(j, listSb.get(j).deleteCharAt(listSb.get(j).length() - 1));
                }
            }
        }
    }
    private void initMap() {
        store.put(2, List.of("a", "b", "c"));
        store.put(3, List.of("d", "e", "f"));
        store.put(4, List.of("g", "h", "i"));
        store.put(5, List.of("j", "k", "l"));
        store.put(6, List.of("m", "n", "o"));
        store.put(7, List.of("p", "q", "r","s"));
        store.put(8, List.of("t", "u", "v"));
        store.put(9, List.of("w", "x", "y","z"));
    }

    public static void main(String[] args) {
        new L_17_LetterCombinationsOfAPhoneNumber().letterCombinations("23");
    }
}

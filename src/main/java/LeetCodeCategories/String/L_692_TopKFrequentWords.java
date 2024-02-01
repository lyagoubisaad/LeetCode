package LeetCodeCategories.String;

import java.util.*;

public class L_692_TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap();
        for (int i=0;i<words.length;i++) {
            if(!hm.containsKey(words[i])) {
                hm.put(words[i],1);
            }
            else {
                hm.put(words[i],(int) hm.get(words[i]) + 1);
            }
        }
        int j=0;
        int[] tab = new int[hm.size()];
        String[] tab_words = new String[hm.size()];
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            tab[j] = (int) entry.getValue();
            tab_words[j] = (String) entry.getKey();
            j++;
        }
        int idx = 0;
        List<String> returnList = new ArrayList();
        while (k>0) {
            int max=0;
            for (int i=0;i<tab.length;i++) {
                if(tab[i] > max || (tab[i] == tab[idx] && tab_words[idx].compareTo(tab_words[i]) < 0)) {
                    max = tab[i];
                    idx = i;
                }
            }
            returnList.add(tab_words[idx]);
            tab[idx] = -1;
            k--;
        }
        return returnList;
     }

    public static void main(String[] args) {
        List<String> returnList = topKFrequent(new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"},4);
        for (int i=0;i<returnList.size();i++) {
            System.out.println(returnList.get(i));
        }
    }
}

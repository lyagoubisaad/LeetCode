package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.List;

public class L_68_TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        ArrayList<ArrayList<Integer>> spaces = new ArrayList<>();
        for (int i=0;i<words.length;i++) {
            if(!sb.isEmpty() && sb.length() + words[i].length() + 1 > maxWidth) {
                list.add(sb + "");
                spaces.add(new ArrayList<>(rows));
                rows.clear();
                sb.setLength(0);
            }
            if(sb.length() == 0) sb.append(words[i]);
            else {
                rows.add(sb.length());
                sb.append(" " + words[i]);
            }
        }
        if(sb.length() != 0) {
            while (sb.length() != maxWidth) {
                sb.insert(sb.length(), " ");
            }
            list.add(sb+"");
        }
        for (int i=0;i<list.size()-1;i++) {
            list.set(i,justify(new StringBuilder(list.get(i)), maxWidth, spaces, i));
        }
        return list;
    }

    private static String justify(StringBuilder s, int maxWidth, ArrayList<ArrayList<Integer>> spaces, int i) {
        int size = maxWidth - s.length();
        if(spaces.get(i).isEmpty()) {
            while (s.length() != maxWidth) s.insert(s.length(), " ");
        } else {
            int k=0;
            int cpt = 0;
            for (int j=0;j<size;j++) {
                s.insert(spaces.get(i).get(k)+k+1+cpt, " ");
                k++;
                if(k == spaces.get(i).size()) {
                    k =0;
                    cpt++;
                }
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        fullJustify(new String[] {"Listen","to","many,","speak","to","a","few."}, 6);
    }
}

package LeetCodeCategories.Math_Geometry;

import java.util.ArrayList;
import java.util.List;

public class L_6_ZigzagConversion {
    public static String convert(String s, int numRows) {
        if(numRows == 1)return s;
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder());
        int cpt = 0;
        int elem = 1;
        for (int i = 0; i < s.length(); i++) {
            if(cpt == 0) elem = 1;
            if(cpt == numRows-1) elem = -1;
            if (list.size() == cpt) list.add(new StringBuilder());
            list.get(cpt).append(s.charAt(i));
            cpt += elem;
        }
        for (int i = 1; i < list.size(); i++) {
            list.get(0).append(list.get(i));
        }
        return list.get(0).toString();
    }
}

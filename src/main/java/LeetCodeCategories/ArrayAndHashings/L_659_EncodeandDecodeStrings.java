package LeetCodeCategories.ArrayAndHashings;

import java.util.ArrayList;
import java.util.List;

public class L_659_EncodeandDecodeStrings {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strs.size()-1;i++) {
            sb.append(strs.get(i));
            sb.append(":;");
        }
        sb.append(strs.get(strs.size()-1));
        return sb.toString();
    }
    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int lastIndex = 0;
        for (int i=1;i<str.length();i++) {
            if (str.charAt(i) == ';' && str.charAt(i-1) == ':') {
                list.add(str.substring(lastIndex, i-1));
                lastIndex = i+1;
            }
        }
        list.add(str.substring(lastIndex));
        return list;
    }
}

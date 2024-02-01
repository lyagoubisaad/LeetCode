package LeetCodeCategories.String;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class L_12_IntegerToRoman {
    public static String intToRoman(int num) {
        TreeMap<Integer,String> ref = new TreeMap<>(Collections.reverseOrder());
        ref.put(1000,"M");
        ref.put(900,"CM");
        ref.put(500,"D");
        ref.put(400,"CD");
        ref.put(100,"C");
        ref.put(90,"XC");
        ref.put(50,"L");
        ref.put(40,"XL");
        ref.put(10,"X");
        ref.put(9,"IX");
        ref.put(5,"V");
        ref.put(4,"IV");
        ref.put(1,"I");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer,String> entry : ref.entrySet()) {
                for (int i=0;i<(num/entry.getKey());i++) {
                    sb.append(entry.getValue());
                }
                num = num%entry.getKey();
        }
        return sb.toString();
    }
}

package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class L68TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<StringBuilder> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (stringBuilder.length() + word.length() <= maxWidth) {
                stringBuilder.append(word).append(" ");
            } else {
                result.add(new StringBuilder(stringBuilder));
                stringBuilder.setLength(0);
                stringBuilder.append(word).append(" ");
            }
        }
        if(!stringBuilder.isEmpty()) {
            result.add(new StringBuilder(stringBuilder));
        }
        for (int i=0;i<result.size();i++) {
            if(result.get(i).charAt(result.get(i).length()-1) == ' ') {
                result.get(i).deleteCharAt(result.get(i).length()-1);
            }
            if(i==result.size()-1) break;
            int j=0;
            boolean flag = false;
            while (result.get(i).length() < maxWidth) {
                if(j==result.get(i).length()) {
                    j=0;
                    if(!flag) {
                        while (result.get(i).length() < maxWidth) result.get(i).insert(result.get(i).length(), " ");
                    }
                }
                if(result.get(i).charAt(j) != ' ') {
                    if(j!=0 && result.get(i).charAt(j-1) == ' ') {
                        flag = true;
                        result.get(i).insert(j, ' ');
                        j++;
                    }
                }
                j++;
            }
        }
        while (result.get(result.size()-1).length() < maxWidth) {
            result.get(result.size()-1).insert(result.get(result.size()-1).length(), " ");
        }
        return result.stream()
                .map(StringBuilder::toString)
                .collect(Collectors.toList());
    }
}

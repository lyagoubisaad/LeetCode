package leetcode_categories.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class L_1647_MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public static int minDeletions(String s) {
        HashMap<Character, Integer> store = new HashMap<>();
        int max = 0;
        for (Character c: s.toCharArray()) {
            store.put(c, store.getOrDefault(c, 0)+1);
            max = Math.max(max, store.get(c));
        }
        int[] arr = new int[max+1];
        for(Map.Entry<Character, Integer> entry: store.entrySet()) {
            arr[entry.getValue()]++;
        }
        int sum = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i=1;i<arr.length;i++) {
            if(arr[i] == 0) {
                stk.push(i);
            }
            else if(arr[i] > 1) {
                if(stk.isEmpty()) sum += (arr[i]-1)*i;
                else {
                    int nbr = arr[i]-1;
                    while (!stk.isEmpty() && nbr > 0) {
                        sum += i-stk.pop();
                        nbr--;
                    } if(nbr > 0) {
                        sum += nbr*i;
                    }
                }
            }
        }
        return sum;
    }
}

package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.*;

public class L_740_DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        TreeMap<Integer,Integer> storeOccurrence = new TreeMap();
        for (int i=0;i<nums.length;i++) {
            if(storeOccurrence.containsKey(nums[i])) {
                storeOccurrence.replace(nums[i], storeOccurrence.get(nums[i])+1);
            } else {
                storeOccurrence.put(nums[i],1);
            }
        }
        List<Integer> keys = new ArrayList();
        List<Integer> values = new ArrayList();
        storeOccurrence.forEach((k,v) -> {
            keys.add(k);
            values.add(v);
        });
        int[] storedValues = new int[keys.size()];
        storedValues[0] = keys.get(0) * values.get(0);
        int elem;
        int precedent = storedValues[0];
        for (int i=1;i<keys.size();i++) {
            elem = keys.get(i) * values.get(i);
            if(keys.get(i-1) == keys.get(i)-1) {
                if(i>=2) elem += storedValues[i-2];
                storedValues[i] = Math.max(precedent,elem);
            } else {
                storedValues[i] = precedent + elem;
            }
            precedent = storedValues[i];
        }
        return storedValues[storedValues.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new L_740_DeleteAndEarn().deleteAndEarn(new int[] {1,2,3,15,16,17,18}));
    }
}

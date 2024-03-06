package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayList;
import java.util.List;

public class L_1049_Last_Stone_Weight_II {
    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i=0;i<stones.length;i++) {
            sum += stones[i];
        }
        int target = sum/2 + sum % 2;
        int reste = Math.abs(target-stones[0]);
        List<List<Integer>> listOfLists = new ArrayList();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(0);
        tmp.add(stones[0]);
        listOfLists.add(tmp);
        for (int i=1;i<stones.length;i++) {
            List<Integer> tmpV1 = new ArrayList<>();
            for (int j=0;j<listOfLists.get(i-1).size();j++) {
                tmpV1.add(listOfLists.get(i-1).get(j));
                tmpV1.add(stones[i]+listOfLists.get(i-1).get(j));
                reste = Math.min(reste, Math.abs(target-stones[i]-listOfLists.get(i-1).get(j)));
            }
            listOfLists.add(tmpV1);
        }
        return reste;
    }

    public static void main(String[] args) {
        lastStoneWeightII(new int[] {2,7,4,1,8,1});
    }
}

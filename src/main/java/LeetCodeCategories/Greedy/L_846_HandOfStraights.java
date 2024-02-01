package LeetCodeCategories.Greedy;

import java.util.Arrays;
import java.util.HashMap;

public class L_846_HandOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int card: hand) {
            store.put(card, store.getOrDefault(card, 0) +1);
        }
        Arrays.sort(hand);
        for (int card: hand) {
            if (store.get(card) <= 0) continue;
            for (int i=1;i<groupSize;i++) {
                int count = store.getOrDefault(card+i, 0);
                if(count > 0) store.put(card+i, count-1); else return false;
            }
            store.put(card, store.get(card)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new L_846_HandOfStraights().isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));

    }
}

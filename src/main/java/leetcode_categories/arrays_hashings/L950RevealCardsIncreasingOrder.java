package leetcode_categories.arrays_hashings;

import java.util.Arrays;
import java.util.LinkedList;

public class L950RevealCardsIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        reverse(deck);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(deck[0]);
        for (int i=1;i<deck.length;i++) {
            list.addFirst(list.removeLast());
            list.addFirst(deck[i]);
        }
        for (int i=0;i<deck.length;i++) {
            deck[i] = list.removeFirst();
        }
        return deck;
    }

    private void reverse(int[] deck) {
        int i=0;
        int j= deck.length-1;
        while (i<j) {
            int tmp = deck[i];
            deck[i] = deck[j];
            deck[j] = tmp;
            i++;
            j--;
        }
    }
}

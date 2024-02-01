package LeetCodeCategories.Linked_List;

import Utils.ListNode;

import java.util.*;

public class L_1290_ConvertBinaryNumberInALinkedListToInteger {

    public static int getDecimalValue(ListNode head) {
        Queue<Integer> queue = new ArrayDeque<>();
        int ret = 0;
        while (head !=null) {
            queue.add(head.val);
            head = head.next;
        }
        while (queue.size() !=0) {
            ret += Math.pow(2,queue.size()-1) * queue.poll();
        }
        return ret;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.push_back(new int[] {1,0,1});
        System.out.println(getDecimalValue(head.next));
    }
}

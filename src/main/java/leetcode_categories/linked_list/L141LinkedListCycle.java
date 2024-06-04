package leetcode_categories.linked_list;

import utils.ListNode;

public class L141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (head != null) {
            fast = fast.next;
            if(fast == null) return false;
            if(fast == head) return true;
            fast = fast.next;
            if(fast == null) return false;
            if(fast == head) return true;
            head = head.next;
        }
        return false;
    }

}

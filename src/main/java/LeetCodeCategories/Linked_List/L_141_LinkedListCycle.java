package LeetCodeCategories.Linked_List;

import Utils.ListNode;

import java.util.HashMap;

public class L_141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if(head == null) return false;
        HashMap hm = new HashMap();
        ListNode current = head;
        while (current.next != null) {
            if(hm.containsKey(current)) return true;
            else hm.put(current,current.val);
            current = current.next;
        }
        return false;
    }

}

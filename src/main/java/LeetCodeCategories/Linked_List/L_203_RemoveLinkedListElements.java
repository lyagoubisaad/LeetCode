package LeetCodeCategories.Linked_List;

import utils.ListNode;

public class L_203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;
        ListNode current = new ListNode();
        current.next = head;
        ListNode dummy = current;
        while (dummy.next != null) {
                while (dummy.next.val == val) {
                    dummy.next = dummy.next.next;
                    if(dummy.next == null) return current.next;
                }
            dummy = dummy.next;
                if(dummy == null) return current.next;
            }
        return current.next;
    }
}

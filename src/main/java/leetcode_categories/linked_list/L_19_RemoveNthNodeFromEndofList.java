package leetcode_categories.linked_list;

import utils.ListNode;

public class L_19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        size = size-n;
        if(size == 0) return head.next;
        curr = head;
        while (curr != null) {
            size--;
            if(size == 0) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}

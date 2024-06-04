package leetcode_categories.linked_list;

import utils.ListNode;

public class L19RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        if(n == size) {
            if(head.next == null) return null;
            head = head.next;
            return head;
        }
        n = size - n;
        while (n != 1) {
            curr = curr.next;
            n--;
        }
        curr.next = curr.next.next;
        return head;
    }
}

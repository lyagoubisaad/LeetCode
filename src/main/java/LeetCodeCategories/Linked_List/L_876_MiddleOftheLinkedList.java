package LeetCodeCategories.Linked_List;

import utils.ListNode;

public class L_876_MiddleOftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int cpt =0;
        while (current != null) {
            cpt++;
            current = current.next;
        }
        cpt = cpt/2;
        while (cpt > 0) {
            cpt--;
            head = head.next;
        }
        return head;
    }
}

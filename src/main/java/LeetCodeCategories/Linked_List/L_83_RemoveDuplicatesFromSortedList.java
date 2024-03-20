package LeetCodeCategories.Linked_List;

import utils.ListNode;

public class L_83_RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if(head == null) return head;
        if(head.next == null) return head;
        while (current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        System.out.println(deleteDuplicates(l1));
    }
}

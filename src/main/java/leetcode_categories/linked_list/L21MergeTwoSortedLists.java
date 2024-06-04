package leetcode_categories.linked_list;

import utils.ListNode;

public class L21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode head = list3;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list3.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                list3.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            list3 = list3.next;
        }
        while (list1 != null) {
            list3.next = new ListNode(list1.val);
            list1 = list1.next;
            list3 = list3.next;
        }
        while (list2 != null) {
            list3.next = new ListNode(list2.val);
            list2 = list2.next;
            list3 = list3.next;
        }
        return head.next;
    }
}

package LeetCodeCategories.Linked_List;

import Utils.ListNode;

public class L_21_Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {
                l3.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                l3.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            l3 = l3.next;
        }

        while (list2 != null) {
            l3.next = new ListNode(list2.val);
            l3 = l3.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            l3.next = new ListNode(list1.val);
            l3 = l3.next;
            list1 = list1.next;
        }
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(0);


        System.out.println(mergeTwoLists(l1, l2));

    }
}

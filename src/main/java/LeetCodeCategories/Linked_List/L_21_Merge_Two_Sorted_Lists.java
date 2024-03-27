package LeetCodeCategories.Linked_List;

import Utils.ListNode;

public class L_21_Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode();
        ListNode list3 = curr;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null) curr.next = list1;
        if(list2 != null) curr.next = list2;

        return list3.next;
    }
}

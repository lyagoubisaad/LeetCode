package LeetCodeCategories.Linked_List;

import Utils.ListNode;

public class L_2_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reste = 0;
        ListNode l3 = new ListNode();
        ListNode curr = l3;
        int tot;
        while (l1 != null || l2 != null) {
            tot = 0;
            if(l1 != null) tot += l1.val;
            if(l2 != null) tot += l2.val;
            if(reste == 1) {
                tot++;
                reste = 0;
            }
            if(tot >= 10) {
                reste = 1;
                tot -=10;
            }
            curr.next = new ListNode(tot);
            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(reste == 1) curr.next = new ListNode(1);
        return l3.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.push_back(new int[] {9,9,9,9,9,9,9});
        ListNode l2 = new ListNode();
        l2.push_back(new int[] {9,9,9,9});
        ListNode l3 = addTwoNumbers(l1, l2);
        l3.display();
    }

}

package LeetCodeCategories.Linked_List;

import utils.ListNode;

public class L_2095_Delete_the_Middle_Node_of_a_Linked_List {

    public static ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        int cpt1 = 1;
        int cpt2 = 0;
        while (current.next != null) {
            cpt1++;
            current = current.next;
        }
        if(cpt1 == 1) {
            return new ListNode();
        }
        cpt1 = cpt1/2;
        System.out.println(cpt1);
        current = head;
        while (cpt2+1 < cpt1) {
            current = current.next;
            cpt2++;
        }
        System.out.println("current value " + current.val);
        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode snd = new ListNode(2);
        ListNode trd = new ListNode(3);
        ListNode frt = new ListNode(4);
        one.next = snd;
        snd.next = trd;
        trd.next = frt;
        deleteMiddle(one);
    }

}

package LeetCodeCategories.Linked_List;

import Utils.ListNode;

public class L_2_Add_Two_Numbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        boolean flag = false;
        while (l1 != null && l2 != null) {
            ListNode tmp1 = l1;
            ListNode tmp2 = l2;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
            }
            while (tmp2.next != null) {
                tmp2 = tmp2.next;
            }
            if (head == null) {
                int tot = l1.val + l2.val;
                if (tot >= 10) {
                    flag = true;
                    tot -= 10;
                }
                head = new ListNode(tot);
                tail = head;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                int tot = l1.val + l2.val;
                if (flag == true) {
                    tot += 1;
                }
                if (tot >= 10) {
                    flag = true;
                    tot -= 10;
                } else {
                    flag = false;
                }
                tail.next = new ListNode(tot);
                tail = tail.next;
                l1 = l1.next;
                l2 = l2.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result.val);
        result = result.next;
        System.out.println(result.val);
        result = result.next;
        System.out.println(result.val);
    }
}


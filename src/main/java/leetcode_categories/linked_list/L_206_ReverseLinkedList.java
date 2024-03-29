package leetcode_categories.linked_list;

import utils.ListNode;

import java.util.Stack;

public class L_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        while (head != null) {
            stk.add(head.val);
            head = head.next;
        }
        ListNode helper = new ListNode();
        head = helper;
        while (!stk.isEmpty()) {
            helper.next = new ListNode(stk.pop());
            helper = helper.next;
        }
        return head.next;
    }
}

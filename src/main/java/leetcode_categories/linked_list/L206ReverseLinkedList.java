package leetcode_categories.linked_list;

import utils.ListNode;

import java.util.Stack;

public class L206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        head = new ListNode();
        ListNode result = head;
        while (!stack.isEmpty()) {
            head.next = new ListNode(stack.pop());
            head = head.next;
        }
        return result.next;
    }
}

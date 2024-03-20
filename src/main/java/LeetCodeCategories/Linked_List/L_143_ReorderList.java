package LeetCodeCategories.Linked_List;

import utils.ListNode;

import java.util.Stack;

public class L_143_ReorderList {
    public void reorderList(ListNode head) {
        ListNode curr = head.next;
        Stack<ListNode> stack = new Stack<>();
        int size = 0;
        while (curr != null) {
            stack.add(curr);
            curr = curr.next;
            size++;
        }
        curr = head;
        while (size > 0) {
            ListNode helper = curr.next;
            curr.next = stack.pop();
            curr = curr.next;
            size--;

            if(size > 0) {
                curr.next = helper;
                curr = curr.next;
                size--;
            }
        }
        curr.next = null;
    }
}

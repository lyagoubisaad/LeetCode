package leetcode_categories.linked_list;

import utils.ListNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class L143ReorderList {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        Queue<ListNode> queue = new ArrayDeque<>();
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            stack.add(curr);
            queue.add(curr);
            curr = curr.next;
            size++;
        }
        boolean flag = true;
        curr = head;
        while (size > 0) {
            if(flag) {
                curr.next = queue.poll();
            } else {
                curr.next = stack.pop();
            }
            curr = curr.next;
            flag = !flag;
            size--;
        }
        curr.next = null;
    }
}

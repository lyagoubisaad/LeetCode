package LeetCodeCategories.Linked_List;

import Utils.ListNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class L_143_ReorderList {
    public static void reorderList(ListNode head) {
        ListNode curr = head.next;
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();
        while (curr != null) {
            stk.add(curr.val);
            queue.add(curr.val);
            curr = curr.next;
        }
        curr = head.next;
        boolean flag = true;
        int tmp;
        while (curr != null) {
            if(flag) tmp = stk.pop();
            else tmp = queue.poll();
            curr.val = tmp;
            flag = !flag;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        ListNode ln = new ListNode();
        ln.push_back(arr);
        reorderList(ln);
        ln.display();

    }
}

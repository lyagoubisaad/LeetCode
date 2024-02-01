package LeetCodeCategories.Linked_List;

import Utils.ListNode;

import java.util.Stack;

public class L_19_RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.isEmpty()) {
            n--;
            if(n!=0) stack1.add(stack.pop());
            else stack.pop();
        }
        if(stack1.isEmpty()) return null;
        head = new ListNode(stack1.pop());
        ListNode curr = head;
        while (!stack1.isEmpty()) {
            head.next = new ListNode(stack1.pop());
            head = head.next;
        }
        return curr;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode();
        ln.push_back(new int[] {1,2,3,4,5});
        ln = removeNthFromEnd(ln,2);
        ln.display();
    }
}

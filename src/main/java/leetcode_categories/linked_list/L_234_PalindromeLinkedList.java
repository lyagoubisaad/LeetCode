package leetcode_categories.linked_list;

import utils.ListNode;

import java.util.Stack;

public class L_234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        Stack<Integer> stk = new Stack<Integer>();
        int length=0;
        while (current != null) {
            stk.push(current.val);
            current = current.next;
        }
        length = stk.size();
        Stack <Integer> q = new Stack();
        for (int i=0;i<length/2;i++) {
            q.push(stk.pop());
        }
        if(q.size() != stk.size()) {
            stk.pop();
        }
        length = stk.size();
        for (int i=0;i<length;i++) {
            if(stk.pop()!= q.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode();
        ln.push_back(new int[] {1,2,2,1});
        System.out.println(isPalindrome(ln.next));

    }
}

package LeetCodeCategories.Linked_List;

import Utils.ListNode;

import java.util.Stack;

public class L_206_ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<ListNode> stk = new Stack<ListNode>();
        while (head.next != null) {
            stk.push(head);
            head = head.next;
        }
        ListNode dummy = head;
        while (!stk.isEmpty()) {
            head.next = new ListNode(stk.pop().val);
            head = head.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode();
        int[] arr = new int[]{1,2,3,4,5};
        for (int i=0;i<arr.length;i++) {
            ln.push_back(arr[i]);
        }
        System.out.println(ln.size());
        System.out.println(reverseList(ln));
    }
}

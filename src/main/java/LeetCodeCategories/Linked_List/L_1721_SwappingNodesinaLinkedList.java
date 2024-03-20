package LeetCodeCategories.Linked_List;

import utils.ListNode;

import java.util.Stack;

public class L_1721_SwappingNodesinaLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        Stack<ListNode> stk = new Stack<>();
        int size = 0;
        int tmp = k;
        ListNode first = null;
        while (curr != null) {
            tmp--;
            if(tmp == 0) first = curr;
            stk.add(curr);
            size++;
            curr = curr.next;
        }
        while (k != 0) {
            k--;
            if(k == 0) {
                int tmp2 = first.val;
                first.val = stk.peek().val;
                stk.peek().val = tmp2;
            }
            stk.pop();
        }
        return head;
    }

    public static void main(String[] args) {

    }
}

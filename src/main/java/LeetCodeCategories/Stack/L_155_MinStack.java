package LeetCodeCategories.Stack;

public class L_155_MinStack {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    public L_155_MinStack() {
    }

    public void push(int val) {
        Node current = new Node(val);
        current.next = head;
        head = current;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        Node current = head;
        int min = current.val;
        while (current.next != null) {
            current = current.next;
            min = Math.min(min, current.val);
        }
        return min;
    }

    public static void main(String[] args) {
        L_155_MinStack ll = new L_155_MinStack();
        ll.push(-2);
        ll.push(0);
        ll.push(-3);
        System.out.println(ll.getMin());
        ll.pop();
        ll.top();
        ll.getMin();
    }
}

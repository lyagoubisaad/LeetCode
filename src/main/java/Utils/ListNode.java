package utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void push_back(int val) {
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }

    public void push_back(int[] arr) {
        if (this.next == null) {
            this.val = arr[0];
            for (int i = 1; i < arr.length; i++) {
                this.push_back(arr[i]);
            }
        } else {
            for (int element : arr) {
                this.push_back(element);
            }
        }
    }

    public void display() {
        ListNode current = this;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public int size() {
        ListNode current = this;
        int cpt = 0;
        while (current != null) {
            current = current.next;
            cpt++;
        }
        return cpt;
    }

    public static boolean compare(ListNode first, ListNode second) {
        if(first == null && second == null) return true;
        if(first == null) return false;
        if(second == null) return false;
        if(first.size() != second.size()) return false;
        while (first != null) {
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public void createCycle(int pos) {
        if(pos < 0) return;
        ListNode helper = new ListNode();
        ListNode curr = this;
        while (curr.next != null) {
            if(pos == 0) {
                helper = this;
            }
            pos--;
            curr = curr.next;
        }
        curr.next = helper;
    }
}

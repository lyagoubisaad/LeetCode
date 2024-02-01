package Utils;

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
            for (int i = 0; i < arr.length; i++) {
                this.push_back(arr[i]);
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
        while (current.next != null) {
            current = current.next;
            cpt++;
        }
        return cpt;
    }
}

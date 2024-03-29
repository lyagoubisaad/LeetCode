package leetcode_categories.linked_list;

import utils.Node;

public class L_138_CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        Node node = new Node(head.val);
        if(head.random == null) {
            node.random = null;
        } else node.random = new Node(head.random.val);
        Node curr = node;
        head = head.next;
        while (head != null) {
            node.next = new Node(head.val);
            if(head.random == null) {
                node.random = null;
            } else node.random = new Node(head.random.val);
            node = node.next;
            head = head.next;
        }
        return curr;
    }
}

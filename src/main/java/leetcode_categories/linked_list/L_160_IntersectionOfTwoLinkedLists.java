package leetcode_categories.linked_list;

import utils.ListNode;

public class L_160_IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int skipA = 0, skipB = 0;
        ListNode currentA = headA;
        ListNode currentB = headB;
        ListNode intersect;
        ListNode dummy = new ListNode();
        while (currentA != null) {
            intersect = new ListNode();
            dummy = intersect;
            skipB = 0;
            ListNode memoA = currentA;
            while (currentB != null) {
                if (currentA == currentB) {
                    intersect.next = new ListNode(currentA.val);
                    intersect = intersect.next;
                    currentA = currentA.next;
                    currentB = currentB.next;
                } else {
                    if (dummy.next != null) {
                        intersect = new ListNode();
                        dummy = intersect;
                        currentB.next = null;
                        currentA = memoA;
                    }
                    skipB++;
                    currentB = currentB.next;
                }
            }
            if (dummy.next != null) {
                return dummy.next;
            } else {
                currentB = headB;
                skipA++;
                currentA = currentA.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        a.push_back(new int[]{4, 1, 8, 4, 5});
        ListNode b = new ListNode();
        b.push_back(new int[]{5, 6, 1, 8, 4, 5});
        ListNode intersect = getIntersectionNode(a.next, b.next);
        System.out.println(intersect.size());
        intersect.display();
    }


}

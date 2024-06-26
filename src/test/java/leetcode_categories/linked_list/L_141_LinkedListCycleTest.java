package leetcode_categories.linked_list;

import org.junit.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L_141_LinkedListCycleTest {

    L141LinkedListCycle myClass = new L141LinkedListCycle();

    @Test
    public void firstTest() {
        ListNode head = new ListNode();
        int[] arr = new int[] {3,2,0,4};
        head.push_back(arr);
        head.createCycle(1);
        assertTrue(myClass.hasCycle(head));
    }

    @Test
    public void secondTest() {
        ListNode head = new ListNode();
        int[] arr = new int[] {1,2};
        head.push_back(arr);
        head.createCycle(0);
        assertTrue(myClass.hasCycle(head));
    }

    @Test
    public void thirdTest() {
        ListNode head = new ListNode();
        int[] arr = new int[] {1};
        head.push_back(arr);
        head.createCycle(-1);
        assertFalse(myClass.hasCycle(head));
    }

}
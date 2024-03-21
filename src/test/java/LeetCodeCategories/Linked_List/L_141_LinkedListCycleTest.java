package leetCodeCategories.Linked_List;

import LeetCodeCategories.Linked_List.L_141_LinkedListCycle;
import org.junit.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class L_141_LinkedListCycleTest {

    L_141_LinkedListCycle myClass = new L_141_LinkedListCycle();

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
package leetCodeCategories.Linked_List;

import org.junit.Test;
import utils.Array;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.ListNode.compare;

public class L_206_ReverseLinkedListTest {

    L_206_ReverseLinkedList myClass = new L_206_ReverseLinkedList();

    @Test
    public void firstTest() {
        int[] entryArray = new int[] {1,2,3,4,5};

        ListNode head = new ListNode();
        head.push_back(entryArray);

        Array.reverseArray(entryArray);

        ListNode result = new ListNode();
        result.push_back(entryArray);

        assertTrue(compare(myClass.reverseList(head), result));
    }

    @Test
    public void secondTest() {
        int[] entryArray = new int[] {1,2};

        ListNode head = new ListNode();
        head.push_back(entryArray);

        Array.reverseArray(entryArray);

        ListNode result = new ListNode();
        result.push_back(entryArray);

        assertTrue(compare(myClass.reverseList(head), result));
    }

    @Test
    public void thirdTest() {
        int[] entryArray = new int[] {};

        ListNode head = new ListNode();
        head.push_back(entryArray);

        Array.reverseArray(entryArray);

        ListNode result = new ListNode();
        result.push_back(entryArray);

        assertTrue(compare(myClass.reverseList(head), result));
    }

}
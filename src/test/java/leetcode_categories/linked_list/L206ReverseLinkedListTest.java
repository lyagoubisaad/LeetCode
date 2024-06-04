package leetcode_categories.linked_list;

import org.junit.jupiter.api.Test;
import utils.Array;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.ListNode.compare;

public class L206ReverseLinkedListTest {

    L206ReverseLinkedList myClass = new L206ReverseLinkedList();

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
        //Given
        int[] entryArray = new int[] {1,2};
        ListNode head = new ListNode();
        //When
        head.push_back(entryArray);

        Array.reverseArray(entryArray);

        ListNode result = new ListNode();
        result.push_back(entryArray);

        //Then
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
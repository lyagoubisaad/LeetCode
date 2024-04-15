package leetcode_categories.linked_list;

import org.junit.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class L_19_RemoveNthNodeFromEndofListTest {

    L_19_RemoveNthNodeFromEndofList myClass = new L_19_RemoveNthNodeFromEndofList();

    @Test
    public void firstTest() {
        int[] inputArray = new int[] {1,2,3,4,5};
        ListNode head = new ListNode();
        head.push_back(inputArray);
        ListNode result = new ListNode();
        int[] resultArray = new int[] {1,2,3,5};
        result.push_back(resultArray);
        assertTrue(ListNode.compare(myClass.removeNthFromEnd(head, 2), result));
    }

    @Test
    public void secondTest() {
        int[] inputArray = new int[] {1};
        ListNode head = new ListNode();
        head.push_back(inputArray);
        assertTrue(ListNode.compare(null, myClass.removeNthFromEnd(head, 1)));
    }

    @Test
    public void thirdTest() {
        int[] inputArray = new int[] {1,2};
        ListNode head = new ListNode();
        head.push_back(inputArray);
        ListNode result = new ListNode();
        int[] resultArray = new int[] {1};
        result.push_back(resultArray);
        assertTrue(ListNode.compare(myClass.removeNthFromEnd(head, 1), result));
    }

    @Test
    public void forthTest() {
        int[] inputArray = new int[] {1,2};
        ListNode head = new ListNode();
        head.push_back(inputArray);
        ListNode result = new ListNode();
        int[] resultArray = new int[] {2};
        result.push_back(resultArray);
        assertTrue(ListNode.compare(myClass.removeNthFromEnd(head, 2), result));
    }

}
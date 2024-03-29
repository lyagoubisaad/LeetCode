package leetcode_categories.linked_list;

import leetcode_categories.arrays_hashings.L_508_WiggleSort;
import utils.ListNode;
import org.junit.Test;

import static utils.ListNode.compare;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class L_143_ReorderListTest {
    L_143_ReorderList myClass = new L_143_ReorderList();
    L_508_WiggleSort helperClass = new L_508_WiggleSort();
    @Test
    public void firstTest() {
        int[] entryArray = new int[] {1,2,3,4};

        ListNode head = new ListNode();
        head.push_back(entryArray);

        helperClass.wiggleSort(entryArray);
        ListNode result = new ListNode();
        result.push_back(entryArray);
        myClass.reorderList(head);
        assertTrue(compare(head, result));
    }

    @Test
    public void secondTest() {

        int[] entryArray = new int[] {1,2,3,4,5};

        ListNode head = new ListNode();
        head.push_back(entryArray);

        helperClass.wiggleSort(entryArray);
        ListNode result = new ListNode();
        result.push_back(entryArray);
        myClass.reorderList(head);
        assertTrue(compare(head, result));
    }

}
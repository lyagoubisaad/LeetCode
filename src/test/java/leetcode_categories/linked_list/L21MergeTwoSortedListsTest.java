package leetcode_categories.linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.ListNode.compare;

public class L21MergeTwoSortedListsTest {

    L21MergeTwoSortedLists myClass;

    @BeforeEach
    void setUp() {
        myClass = new L21MergeTwoSortedLists();
    }

    @Test
    public void testFirst() {
        //Given
        int[] array1 = new int[] {1,2,4};
        ListNode list1 = new ListNode();
        list1.push_back(array1);

        int[] array2 = new int[] {1,3,4};
        ListNode list2 = new ListNode();
        list2.push_back(array2);

        int[] arrayExpected = new int[] {1,1,2,3,4,4};
        ListNode expected = new ListNode();
        expected.push_back(arrayExpected);
        //When
        ListNode result = myClass.mergeTwoLists(list1, list2);
        //Then
        assertTrue(compare(expected, result));
    }

    @Test
    public void testSecond() {
        //Given
        int[] array1 = new int[] {};
        ListNode list1 = new ListNode();
        list1.push_back(array1);

        int[] array2 = new int[] {};
        ListNode list2 = new ListNode();
        list2.push_back(array2);

        int[] arrayExpected = new int[] {};
        ListNode expected = new ListNode();
        expected.push_back(arrayExpected);
        //When
        ListNode result = myClass.mergeTwoLists(list1, list2);
        result.next = null;
        //Then
        assertTrue(compare(expected, result));
    }


    @Test
    public void testThird() {
        //Given
        int[] array1 = new int[] {};
        ListNode list1 = new ListNode();
        list1.push_back(array1);

        int[] array2 = new int[] {0};
        ListNode list2 = new ListNode();
        list2.push_back(array2);

        int[] arrayExpected = new int[] {0};
        ListNode expected = new ListNode();
        expected.push_back(arrayExpected);
        //When
        ListNode result = myClass.mergeTwoLists(list1, list2);
        result.next = null;
        //Then
        assertTrue(compare(expected, result));
    }

}
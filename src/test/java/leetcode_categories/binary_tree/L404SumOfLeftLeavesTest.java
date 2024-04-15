package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L404SumOfLeftLeavesTest {

    L404SumOfLeftLeaves myClass;

    @BeforeEach
    void setUp() {
        myClass = new L404SumOfLeftLeaves();
    }

    @Test
    public void testFirst() {
        //Given
        Integer[] data = new Integer[] {1,2,3,4,5};
        TreeNode root = TreeNode.formTree(data);
        //When
        int actual = myClass.sumOfLeftLeaves(root);
        //Then
        assertEquals(4, actual);
    }

}
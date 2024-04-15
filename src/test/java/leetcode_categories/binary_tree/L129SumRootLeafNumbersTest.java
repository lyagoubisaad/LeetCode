package leetcode_categories.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

public class L129SumRootLeafNumbersTest {

    L129SumRootLeafNumbers myClass;

    @BeforeEach
    void setUp() {
        myClass = new L129SumRootLeafNumbers();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[]{1,2,3});
        //When
        int actual = myClass.sumNumbers(root);
        //Then
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[]{4,9,0,5,1});
        //When
        int actual = myClass.sumNumbers(root);
        //Then
        Assertions.assertEquals(1026, actual);
    }

}
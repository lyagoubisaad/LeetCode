package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class L124BinaryTreeMaximumPathSumTest {

    L124BinaryTreeMaximumPathSum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L124BinaryTreeMaximumPathSum();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {1,2,3});
        //When
        int result = myClass.maxPathSum(root);
        //Then
        assertEquals(6, result);
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {-10,9,20,null,null,15,7});
        //When
        int result = myClass.maxPathSum(root);
        //Then
        assertEquals(42, result);
    }

}
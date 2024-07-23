package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class L105ConstructBinaryTreePreorderInorderTraversalTest {

    L105ConstructBinaryTreePreorderInorderTraversal myClass;

    @BeforeEach
    void setUp() {
        myClass = new L105ConstructBinaryTreePreorderInorderTraversal();
    }

    @Test
    public void testFirst() {
        //Given
        int[] preOrder = new int[] {3,9,20,15,7};
        int[] inOrder = new int[] {9,3,15,20,7};
        TreeNode expected = TreeNode.formTree(new Integer[] {3,9,20,null,null,15,7});
        //When & Then
        assertTrue(TreeNode.compare(expected, myClass.buildTree(preOrder, inOrder)));
    }

    @Test
    public void testSecond() {
        //Given
        int[] preOrder = new int[] {-1};
        int[] inOrder = new int[] {-1};
        TreeNode expected = TreeNode.formTree(new Integer[] {-1});
        //When & Then
        assertTrue(TreeNode.compare(expected, myClass.buildTree(preOrder, inOrder)));
    }

}
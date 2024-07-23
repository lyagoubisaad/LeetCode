package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class L230KthSmallestElementBSTTest {

    L230KthSmallestElementBST myClass;

    @BeforeEach
    void setUp() {
        myClass = new L230KthSmallestElementBST();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {3,1,4,null,2});
        //When & Then
        assertEquals(1, myClass.kthSmallest(root, 1));
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {5,3,6,2,4,null,null,1});
        //When & Then
        assertEquals(3, myClass.kthSmallest(root, 3));
    }

}
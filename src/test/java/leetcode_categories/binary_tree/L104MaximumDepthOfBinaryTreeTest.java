package leetcode_categories.binary_tree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L104MaximumDepthOfBinaryTreeTest {

    L104MaximumDepthOfBinaryTree myClass = new L104MaximumDepthOfBinaryTree();

    @Test
    public void firstTest() {
        Integer[] data = new Integer[] {3,9,20,null,null,15,7};
        TreeNode tree = TreeNode.formTree(data);
        assertEquals(3, myClass.maxDepth(tree));
    }

    @Test
    public void secondTest() {
        Integer[] data = new Integer[] {1,null,2};
        TreeNode tree = TreeNode.formTree(data);
        assertEquals(2, myClass.maxDepth(tree));
    }

}
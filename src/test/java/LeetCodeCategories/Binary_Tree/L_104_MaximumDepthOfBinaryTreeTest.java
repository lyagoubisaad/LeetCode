package leetCodeCategories.Binary_Tree;

import LeetCodeCategories.Binary_Tree.L_104_MaximumDepthOfBinaryTree;
import utils.TreeNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_104_MaximumDepthOfBinaryTreeTest {

    L_104_MaximumDepthOfBinaryTree myClass = new L_104_MaximumDepthOfBinaryTree();

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
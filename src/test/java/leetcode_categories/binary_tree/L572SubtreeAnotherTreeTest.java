package leetcode_categories.binary_tree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L572SubtreeAnotherTreeTest {

    L572SubtreeAnotherTree myClass = new L572SubtreeAnotherTree();

    @Test
    public void testFirst() {
        TreeNode node1 = TreeNode.formTree(new Integer[] {3,4,5,1,2});
        TreeNode node2 = TreeNode.formTree(new Integer[] {4,1,2});
        assertTrue(myClass.isSubtree(node1, node2));
    }

    @Test
    public void testSecond() {
        TreeNode node1 = TreeNode.formTree(new Integer[] {3,4,5,1,2,null,null,null,null,0});
        TreeNode node2 = TreeNode.formTree(new Integer[] {4,1,2});
        assertFalse(myClass.isSubtree(node1, node2));
    }

    @Test
    public void testThird() {
        TreeNode node1 = TreeNode.formTree(new Integer[] {1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,2});
        TreeNode node2 = TreeNode.formTree(new Integer[] {1,null,1,null,1,null,1,null,1,null,1,2});
        assertTrue(myClass.isSubtree(node1, node2));
    }

}
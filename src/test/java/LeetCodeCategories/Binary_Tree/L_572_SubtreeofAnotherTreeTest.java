package leetCodeCategories.Binary_Tree;

import LeetCodeCategories.Binary_Tree.L_572_SubtreeofAnotherTree;
import org.junit.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class L_572_SubtreeofAnotherTreeTest {

    L_572_SubtreeofAnotherTree myClass = new L_572_SubtreeofAnotherTree();

    @Test
    public void firstTest() {
        TreeNode node1 = TreeNode.formTree(new Integer[] {3,4,5,1,2});
        TreeNode node2 = TreeNode.formTree(new Integer[] {4,1,2});
        assertTrue(myClass.isSubtree(node1, node2));
    }

}
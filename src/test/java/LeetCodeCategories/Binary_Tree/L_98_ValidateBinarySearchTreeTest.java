package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class L_98_ValidateBinarySearchTreeTest {

    L_98_ValidateBinarySearchTree myClass = new L_98_ValidateBinarySearchTree();

    @Test
    public void firstTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {1,null,1});
        assertFalse(myClass.isValidBST(root));
    }

    @Test
    public void secondTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {5,4,6,null,null,3,7});
        assertFalse(myClass.isValidBST(root));
    }



}
package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_235_LowestCommonAncestorOfABinarySearchTreeTest {

    L_235_LowestCommonAncestorOfABinarySearchTree myClass = new L_235_LowestCommonAncestorOfABinarySearchTree();
    
    @Test
    public void firstTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {6,2,8,0,4,7,9,null,null,3,5});
        TreeNode p = TreeNode.formTree(new Integer[] {2});
        TreeNode q = TreeNode.formTree(new Integer[] {8});
        assertEquals(6, myClass.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void secondTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {6,2,8,0,4,7,9,null,null,3,5});
        TreeNode p = TreeNode.formTree(new Integer[] {2});
        TreeNode q = TreeNode.formTree(new Integer[] {4});
        assertEquals(2, myClass.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void thirdTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {2,1});
        TreeNode p = TreeNode.formTree(new Integer[] {2});
        TreeNode q = TreeNode.formTree(new Integer[] {1});
        assertEquals(2, myClass.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void forthTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {6,2,8,0,4,7,9,null,null,3,5});
        TreeNode p = TreeNode.formTree(new Integer[] {3});
        TreeNode q = TreeNode.formTree(new Integer[] {5});
        assertEquals(4, myClass.lowestCommonAncestor(root, p, q).val);
    }


}
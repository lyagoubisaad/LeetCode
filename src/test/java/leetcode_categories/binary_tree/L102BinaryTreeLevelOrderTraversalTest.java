package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L102BinaryTreeLevelOrderTraversalTest {

    L102BinaryTreeLevelOrderTraversal myClass;

    @BeforeEach
    void setUp() {
        myClass = new L102BinaryTreeLevelOrderTraversal();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {3,9,20,null,null,15,7});
        List<List<Integer>> expected = List.of(
                List.of(3), List.of(9,20), List.of(15,7)
        );
        //When
        List<List<Integer>> result = myClass.levelOrder(root);

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {1});
        List<List<Integer>> expected = List.of(List.of(1));
        //When
        List<List<Integer>> result = myClass.levelOrder(root);

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testThird() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {});
        List<List<Integer>> expected = List.of(List.of());
        //When
        List<List<Integer>> result = myClass.levelOrder(root);

        //Then
        assertEquals(expected, result);
    }


}
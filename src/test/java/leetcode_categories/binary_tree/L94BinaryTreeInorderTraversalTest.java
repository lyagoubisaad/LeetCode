package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L94BinaryTreeInorderTraversalTest {
    L94BinaryTreeInorderTraversal myClass;

    @BeforeEach
    void setUp() {
        myClass = new L94BinaryTreeInorderTraversal();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {1,null,2,3});
        List<Integer> expected = Arrays.asList(1,3,2);
        //When & Then
        assertEquals(expected, myClass.inorderTraversal(root));
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {});
        List<Integer> expected = List.of();
        //When & Then
        assertEquals(expected, myClass.inorderTraversal(root));
    }

    @Test
    public void testThird() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {1});
        List<Integer> expected = List.of(1);
        //When & Then
        assertEquals(expected, myClass.inorderTraversal(root));
    }

}
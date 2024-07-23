package leetcode_categories.binary_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class L98ValidateBinarySearchTreeTest {
    L98ValidateBinarySearchTree myClass = new L98ValidateBinarySearchTree();
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void isValidBSTTest(TreeNode root, boolean expected) {
        if (expected) {
            assertTrue(myClass.isValidBST(root));
        } else {
            assertFalse(myClass.isValidBST(root));
        }
    }
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(TreeNode.formTree(new Integer[] {2,1,3}), true),
                Arguments.of(TreeNode.formTree(new Integer[] {5,1,4,null,null,3,6}), false),
                Arguments.of(TreeNode.formTree(new Integer[] {5,4,6,null,null,3,7}), false),
                Arguments.of(TreeNode.formTree(new Integer[] {32,26,47,19,null,null,56,null,27}), false)
        );
    }
}
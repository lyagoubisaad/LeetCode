package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L988SmallestStringStartingFromLeafTest {

    L988SmallestStringStartingFromLeaf myClass;

    @BeforeEach
    void setUp() {
        myClass = new L988SmallestStringStartingFromLeaf();
    }

    @Test
    public void testFirst() {
        //Given
        Integer[] data = new Integer[]{0, 1, 2, 3, 4, 3, 4};
        //When
        String actual = myClass.smallestFromLeaf(TreeNode.formTree(data));
        //Then
        assertEquals("dba", actual);
    }

    @Test
    public void testSecond() {
        //Given
        Integer[] data = new Integer[]{2,2,1,null,1,0,null,0};
        //When
        String actual = myClass.smallestFromLeaf(TreeNode.formTree(data));
        //Then
        assertEquals("abc", actual);
    }

    @Test
    public void testThird() {
        //Given
        Integer[] data = new Integer[]{4,0,1,1};
        //When
        String actual = myClass.smallestFromLeaf(TreeNode.formTree(data));
        //Then
        assertEquals("bae", actual);
    }

    @Test
    public void testForth() {
        //Given
        Integer[] data = new Integer[]{25,1,null,0,0,1,null,null,null,0};
        //When
        String actual = myClass.smallestFromLeaf(TreeNode.formTree(data));
        //Then
        assertEquals("ababz", actual);
    }



}
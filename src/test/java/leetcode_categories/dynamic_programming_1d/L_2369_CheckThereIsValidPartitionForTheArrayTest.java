package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L_2369_CheckThereIsValidPartitionForTheArrayTest {

    L_2369_CheckThereIsValidPartitionForTheArray myClass = new L_2369_CheckThereIsValidPartitionForTheArray();

    @Test
    public void firstTest() {
        int[] nums = new int[] {4,4,4,5,6};
        assertTrue(myClass.validPartition(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1,1,1,2};
        assertFalse(myClass.validPartition(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {1,2,1};
        assertFalse(myClass.validPartition(nums));
    }

}
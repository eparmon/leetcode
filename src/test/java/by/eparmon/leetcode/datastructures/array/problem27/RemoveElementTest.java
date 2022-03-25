package by.eparmon.leetcode.datastructures.array.problem27;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    private final RemoveElement solution = new RemoveElement();

    @Test
    public void test() {
        doTest(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2});
    }

    @Test
    public void test2() {
        doTest(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 0, 1, 3, 4});
    }

    @Test
    public void test3() {
        doTest(new int[]{1}, 1, new int[]{});
    }

    private void doTest(int[] nums, int val, int[] expectedSortedNums) {
        int newLength = solution.solve(nums, val);
        Assertions.assertEquals(expectedSortedNums.length, newLength);
        nums = Arrays.copyOfRange(nums, 0, expectedSortedNums.length);
        Arrays.sort(nums);
        Assertions.assertArrayEquals(expectedSortedNums, nums);
    }

}

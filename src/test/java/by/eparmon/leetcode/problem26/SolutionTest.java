package by.eparmon.leetcode.problem26;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        doTest(new int[]{1, 1, 2}, new int[]{1, 2});
    }

    @Test
    public void test2() {
        doTest(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4});
    }

    @Test
    public void test3() {
        doTest(new int[]{1, 1}, new int[]{1});
    }

    private void doTest(int[] nums, int[] expectedNums) {
        int newLength = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedNums.length, newLength);
        nums = Arrays.copyOfRange(nums, 0, expectedNums.length);
        Assertions.assertArrayEquals(expectedNums, nums);
    }

}

package by.eparmon.leetcode.problem1089;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(nums);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0};
        solution.duplicateZeros(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, nums);
    }

}

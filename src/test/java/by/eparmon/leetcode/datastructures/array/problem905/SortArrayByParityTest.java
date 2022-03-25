package by.eparmon.leetcode.datastructures.array.problem905;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortArrayByParityTest {

    private final SortArrayByParity solution = new SortArrayByParity();

    @Test
    public void test1() {
        doTest(new int[]{3, 1, 2, 4}, new int[]{2, 4}, new int[]{1, 3});
    }

    @Test
    public void test2() {
        doTest(new int[]{0}, new int[]{0}, new int[0]);
    }

    private void doTest(int[] nums, int[] sortedExpectedEvenNums, int[] sortedExpectedOddNums) {
        nums = solution.solve(nums);
        int[] evenNums = Arrays.copyOf(nums, sortedExpectedEvenNums.length);
        Arrays.sort(evenNums);
        Assertions.assertArrayEquals(sortedExpectedEvenNums, evenNums);
        int[] oddNums = Arrays.copyOfRange(nums, sortedExpectedEvenNums.length, nums.length);
        Arrays.sort(oddNums);
        Assertions.assertArrayEquals(sortedExpectedOddNums, oddNums);
    }

}

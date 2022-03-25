package by.eparmon.leetcode.datastructures.array.problem283;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    public void test1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{2, 1};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{2, 1}, nums);
    }

}

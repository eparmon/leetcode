package by.eparmon.leetcode.datastructures.arrays.problem1089;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DuplicateZerosTest {

    private final DuplicateZeros solution = new DuplicateZeros();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, nums);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3};
        solution.solve(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    public void testWithStreams1() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution.solveWithStreams(nums);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, nums);
    }

    @Test
    public void testWithStreams2() {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0};
        solution.solveWithStreams(nums);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, nums);
    }

    @Test
    public void testWithStreams3() {
        int[] nums = new int[]{1, 2, 3};
        solution.solveWithStreams(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

}

package by.eparmon.leetcode.datastructures.array.problem88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    public void test1() {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        solution.solve(array1, 3, array2, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, array1);
    }

    @Test
    public void test2() {
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{};
        solution.solve(array1, 1, array2, 0);
        Assertions.assertArrayEquals(new int[]{1}, array1);
    }

    @Test
    public void test3() {
        int[] array1 = new int[]{0};
        int[] array2 = new int[]{1};
        solution.solve(array1, 0, array2, 1);
        Assertions.assertArrayEquals(new int[]{1}, array1);
    }

    @Test
    public void testWithStreams1() {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        solution.solveWithStreams(array1, 3, array2, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, array1);
    }

    @Test
    public void testWithStreams2() {
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{};
        solution.solveWithStreams(array1, 1, array2, 0);
        Assertions.assertArrayEquals(new int[]{1}, array1);
    }

    @Test
    public void testWithStreams3() {
        int[] array1 = new int[]{0};
        int[] array2 = new int[]{1};
        solution.solveWithStreams(array1, 0, array2, 1);
        Assertions.assertArrayEquals(new int[]{1}, array1);
    }

}

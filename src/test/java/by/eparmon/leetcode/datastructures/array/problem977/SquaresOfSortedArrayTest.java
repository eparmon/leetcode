package by.eparmon.leetcode.datastructures.array.problem977;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquaresOfSortedArrayTest {

    private final SquaresOfSortedArray solution = new SquaresOfSortedArray();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                solution.solve(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{4, 9, 9, 49, 121},
                solution.solve(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    public void testWithStreams1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                solution.solveWithStreams(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    public void testWithStreams2() {
        Assertions.assertArrayEquals(new int[]{4, 9, 9, 49, 121},
                solution.solveWithStreams(new int[]{-7, -3, 2, 3, 11}));
    }

}

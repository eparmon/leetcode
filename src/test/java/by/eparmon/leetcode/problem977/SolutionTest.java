package by.eparmon.leetcode.problem977;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, 
                solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }
}

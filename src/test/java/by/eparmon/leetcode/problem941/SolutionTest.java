package by.eparmon.leetcode.problem941;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assertions.assertFalse(solution.validMountainArray(new int[]{2, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertFalse(solution.validMountainArray(new int[]{3, 5, 5}));
    }

    @Test
    public void test3() {
        Assertions.assertTrue(solution.validMountainArray(new int[]{0, 3, 2, 1}));
    }

}

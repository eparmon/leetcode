package by.eparmon.leetcode.problem1346;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assertions.assertTrue(solution.checkIfExist(new int[]{10, 2, 5, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertTrue(solution.checkIfExist(new int[]{7, 1, 14, 11}));
    }

    @Test
    public void test3() {
        Assertions.assertFalse(solution.checkIfExist(new int[]{3, 1, 7, 11}));
    }

    @Test
    public void test4() {
        Assertions.assertTrue(solution.checkIfExist(new int[]{-10, 12, -20, -8, 15}));
    }

    @Test
    public void test5() {
        Assertions.assertFalse(solution.checkIfExist(new int[]{-16, -19}));
    }

    @Test
    public void test6() {
        Assertions.assertFalse(solution.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }

}

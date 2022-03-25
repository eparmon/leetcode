package by.eparmon.leetcode.datastructures.array.problem941;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {

    private final ValidMountainArray solution = new ValidMountainArray();

    @Test
    public void test() {
        Assertions.assertFalse(solution.solve(new int[]{2, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertFalse(solution.solve(new int[]{3, 5, 5}));
    }

    @Test
    public void test3() {
        Assertions.assertTrue(solution.solve(new int[]{0, 3, 2, 1}));
    }

}

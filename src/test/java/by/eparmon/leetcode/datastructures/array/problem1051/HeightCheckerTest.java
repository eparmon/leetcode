package by.eparmon.leetcode.datastructures.array.problem1051;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeightCheckerTest {

    private final HeightChecker solution = new HeightChecker();

    @Test
    public void test1() {
        Assertions.assertEquals(3, solution.solve(new int[]{1, 1, 4, 2, 1, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(5, solution.solve(new int[]{5, 1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0, solution.solve(new int[]{1, 2, 3, 4, 5}));
    }

}

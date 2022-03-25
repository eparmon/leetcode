package by.eparmon.leetcode.datastructures.array.problem414;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {

    private final ThirdMaximumNumber solution = new ThirdMaximumNumber();

    @Test
    public void test1() {
        Assertions.assertEquals(1, solution.solve(new int[]{3, 2, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, solution.solve(new int[]{1, 2}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1, solution.solve(new int[]{2, 2, 3, 1}));
    }

}

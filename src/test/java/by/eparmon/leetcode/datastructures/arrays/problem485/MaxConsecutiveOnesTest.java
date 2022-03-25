package by.eparmon.leetcode.datastructures.arrays.problem485;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    public void test1() {
        Assertions.assertEquals(3, solution.solve(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, solution.solve(new int[]{1, 0, 1, 1, 0, 1}));
    }

}

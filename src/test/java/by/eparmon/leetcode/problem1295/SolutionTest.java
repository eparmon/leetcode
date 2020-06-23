package by.eparmon.leetcode.problem1295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assertions.assertEquals(2, 
                solution.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

}

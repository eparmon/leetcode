package by.eparmon.leetcode.problem485;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    private final Solution solution = new Solution();
    
    @Test
    public void test() {
        Assertions.assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}

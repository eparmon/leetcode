package by.eparmon.leetcode.datastructures.arrays.problem448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class FindAllNumbersDisappearedInArrayTest {

    private final FindAllNumbersDisappearedInArray solution = new FindAllNumbersDisappearedInArray();

    @Test
    public void test1() {
        List<Integer> res = solution.solve(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        Collections.sort(res);
        Assertions.assertEquals(List.of(5, 6), res);
    }

    @Test
    public void test2() {
        List<Integer> res = solution.solve(new int[]{1, 1});
        Collections.sort(res);
        Assertions.assertEquals(List.of(2), res);
    }

}

package by.eparmon.leetcode.datastructures.arrays.problem448;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the
 * range [1, n] that do not appear in nums.
 * <p>
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">Leetcode</a>
 */
public class FindAllNumbersDisappearedInArray {

    public List<Integer> solve(int[] nums) {
        List<Integer> res = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            res.add(i + 1);
        }
        for (int num : nums) {
            res.set(num - 1, -1);
        }
        int r = res.size();
        for (int l = 0; l < r; l++) {
            if (res.get(l) == -1) {
                do {
                    r--;
                } while (l < r && res.get(r) == -1);
                res.set(l, res.get(r));
            }
        }
        if (res.size() > r) {
            res.subList(r, res.size()).clear();
        }
        return res;
    }

}

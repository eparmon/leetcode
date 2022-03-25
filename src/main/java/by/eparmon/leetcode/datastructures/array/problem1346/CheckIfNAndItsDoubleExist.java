package by.eparmon.leetcode.datastructures.array.problem1346;

import java.util.Arrays;

/**
 * Given an array arr of integers, check if there exists two integers N and M
 * such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that:
 * <ul>
 *   <li>i != j;</li>
 *   <li>0 <= i, j < arr.length;</li>
 *   <li>arr[i] == 2 * arr[j];</li>
 * </ul>
 * <p>
 * <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">Leetcode</a>
 */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0, j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 1) {
                continue;
            }
            while (arr[i] * 2 < arr[j]) {
                i++;
                if (i == arr.length) {
                    return false;
                }
            }
            if (i != j && arr[i] * 2 == arr[j]) {
                return true;
            }
        }
        return false;
    }

}

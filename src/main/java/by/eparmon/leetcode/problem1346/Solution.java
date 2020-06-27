package by.eparmon.leetcode.problem1346;

import java.util.Arrays;

/**
 * Given an array arr of integers, check if there exists two integers N and M
 * such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that:
 *
 * i != j;
 *
 * 0 <= i, j < arr.length;
 *
 * arr[i] == 2 * arr[j];
 *
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 *
 */
public class Solution {

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

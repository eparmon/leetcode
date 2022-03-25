package by.eparmon.leetcode.datastructures.arrays.problem88;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * <p>
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from
 * nums2.
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array/">Leetcode</a>
 */
public class MergeSortedArray {

    public void solve(int[] nums1, int m, int[] nums2, int n) {
        int[] sortedMerged = new int[m + n];
        int i = 0;
        int j = 0;
        while (i + j < m + n) {
            if (j == n || (i != m && nums1[i] < nums2[j])) {
                sortedMerged[i + j] = nums1[i++];
            } else {
                sortedMerged[i + j] = nums2[j++];
            }
        }
        for (i = 0; i < m + n; i++) {
            nums1[i] = sortedMerged[i];
        }
    }


    public void solveWithStreams(int[] nums1, int m, int[] nums2, int n) {
        int[] res = IntStream.concat(Arrays.stream(nums1).limit(m),
                        Arrays.stream(nums2).limit(n))
                .sorted()
                .toArray();
        System.arraycopy(res,0, nums1, 0, nums1.length);
    }

}

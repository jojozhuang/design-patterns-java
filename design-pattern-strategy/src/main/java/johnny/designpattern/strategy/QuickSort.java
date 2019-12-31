package johnny.designpattern.strategy;

import java.util.Arrays;

public class QuickSort implements Sorting {

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Quick sort on array:" + Arrays.toString(nums));

        if (nums == null || nums.length < 2) {
            return nums;
        }

        helper(nums, 0, nums.length - 1);

        return nums;
    }

    private void helper(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(nums, start, end);
        helper(nums, start, pivot - 1);
        helper(nums, pivot + 1, end);
    }

    // one way
    private int partition(int[] nums, int start, int end) {
        int pivot = start; // select the first as the pivot

        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[start]) {
                pivot++;
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[start];
        nums[start] = temp;
        return pivot;
    }
}
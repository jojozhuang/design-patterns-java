package johnny.designpattern.strategy;

import java.util.Arrays;

public class MergeSort implements Sorting {

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Merge sort on array:" + Arrays.toString(nums));

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

        int mid = start + (end - start) / 2;
        helper(nums, start, mid);
        helper(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] copy = Arrays.copyOf(nums, nums.length);

        int left = start;
        int right = mid + 1;
        for (int k = start; k <= end; k++) {
            if (left > mid) { // no item at left
                nums[k] = copy[right];
                right++;
            }
            else if(right > end) { // no item at right
                nums[k] = copy[left];
                left++;
            }
            else if (copy[left] <= copy[right]) {
                nums[k] = copy[left];
                left++;
            }
            else{
                nums[k] = copy[right];
                right++;
            }
        }
    }
}

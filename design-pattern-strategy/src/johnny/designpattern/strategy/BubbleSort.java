package johnny.designpattern.strategy;

import java.util.Arrays;

public class BubbleSort implements Sorting {

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Bubble sort on array:" + Arrays.toString(nums));

        if (nums == null || nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        return nums;
    }
}

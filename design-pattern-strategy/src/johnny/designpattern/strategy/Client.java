package johnny.designpattern.strategy;

import java.util.Arrays;

public class Client {
    public void run() {
        int[] nums = new int[]{3,5,1,8,2,9,7,4};

        Context context = new Context(new BubbleSort());
        System.out.println(Arrays.toString(context.executeStrategy(nums.clone())));

        context = new Context(new MergeSort());
        System.out.println(Arrays.toString(context.executeStrategy(nums.clone())));

        context = new Context(new QuickSort());
        System.out.println(Arrays.toString(context.executeStrategy(nums.clone())));
    }
}

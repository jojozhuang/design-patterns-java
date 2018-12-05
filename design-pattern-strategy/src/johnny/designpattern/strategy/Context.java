package johnny.designpattern.strategy;

public class Context {
    private Sorting sorting;

    public Context(Sorting sorting){
        this.sorting = sorting;
    }

    public int[] executeStrategy(int[] nums){
        return sorting.sort(nums);
    }
}

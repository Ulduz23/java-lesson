package lesson7;

public class Stats <T extends Number>{
    T[] nums;

    public Stats(T[] nums){
        this.nums = nums;
    }
    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) {
        this.nums = nums;
    }

    
}

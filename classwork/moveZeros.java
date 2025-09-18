package classwork;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        moveZeroes(nums);
        
        System.out.println(Arrays.toString(nums));  
    }
    
    public static void moveZeroes(int[] nums) {
        int index = 0;
        
       
        for (int ele : nums) {
            if (ele != 0) {
                nums[index++] = ele;
            }
        }
        
       
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

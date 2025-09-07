package classwork;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        moveZeroes(nums);
        
        System.out.println(Arrays.toString(nums));  // Print the modified array
    }
    
    public static void moveZeroes(int[] nums) {
        int index = 0;
        
        // Move non-zero elements to the front
        for (int ele : nums) {
            if (ele != 0) {
                nums[index++] = ele;
            }
        }
        
        // Fill remaining elements with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
